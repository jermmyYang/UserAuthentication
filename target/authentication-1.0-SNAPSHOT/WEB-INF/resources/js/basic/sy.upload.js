;
/**
 * 上传模块
 * 
 * @author jermmy
 */
(function(sy){
	
	   
	
	    sy.upload = {
	    		
	    		defaultOPtion:null,
	    		
	    		init:function(option){
	    			this.defaultOPtion = option;
	    		},
	           /**
				 * 获取上传文件实例
				 */ 
	    		getUploadInstance:function(option){
	    			
	    			 this.init(option);
	    			 
	    			 var uploader = new plupload.Uploader({
	    			        browse_button : option.selectBtn, // 触发文件选择对话框的按钮，为那个元素id
	    			        url : option.url, // 服务器端的上传页面地址
	    			        flash_swf_url : 'resources/js/plupload/Moxie.swf', // swf文件，当需要使用swf方式进行上传时需要配置该参数
	    			        silverlight_xap_url : 'resources/js/plupload/Moxie.xap', // silverlight文件，当需要使用silverlight方式进行上传时需要配置该参数
	    			        filters: {
	    			              mime_types : [ // 只允许上传图片和zip文件
	    			        		    { title : "Image files", extensions : "jpg,gif,png" }, 
	    			        		 ],
	    			              max_file_size : '400000kb', // 最大只能上传400kb的文件
	    			        	  prevent_duplicates : true // 不允许选取重复文件
	    			          },
	    			        multi_selection:false             //一次只能选择一个文件进行上传
	    			 
	    			 });
	    			 
	    			 uploader.init();
	    			 
	    			 this.filesAddEvent(uploader);
	    			 
	    			 return uploader;
	    		},
	    		/**
				 * 对上传uploader实例添加文件添加事件
				 */ 
	    		filesAddEvent:function(uploader){
	    			
	    			var that = this;
	    			
	    			uploader.bind('FilesAdded',function(uploader,files){
	    		       
	    				      if(uploader.files.length>that.defaultOPtion.length){
	    				    	  
	    				    	    for(var i=0,max=that.defaultOPtion.length;i<max;++i){
	    				    	    	uploader.files.shift();
	    				    	    }
	    				    	  
	    				      }
	    				     
	    				      $.each(uploader.files,function(){
	    				    	  
	    				    	  that.previewImage(this, function(imgUrl){
	    				    		    $("#headimg").attr("src",imgUrl);
	    				    	  });
	    				    	  
	    				      });
	    				    
	    				
	    		    });
	    			
	    		},
	    		/**
				 * 对上传uploader实例添加文件上传成功事件
				 */
	    		filesUploadSuccessEvent:function(uploader,callback){
	    			
	    			uploader.bind("UploadComplete",function(uploader,files){
	    				
	    				callback();
	    				
	    			});
	    			
	    		},
	    		
	    		previewImage:function(file,callback){
                   
	    			  if(file.type=='image/gif'){// gif使用FileReader进行预览,因为mOxie.Image只支持jpg和png
	    			     var fr = new mOxie.FileReader();
	    			     fr.onload = function(){
			    			 callback(fr.result);
			    			 fr.destroy();
			    			 fr = null;
	    			     }
	    			    fr.readAsDataURL(file.getSource());
	    			    
	    			  }else{
			    			var preloader = new mOxie.Image();
			    			preloader.onload = function() {
			    			preloader.downsize( 300, 300 );// 先压缩一下要预览的图片,宽300，高300
			    			var imgsrc = preloader.type=='image/jpeg' ? preloader.getAsDataURL('image/jpeg',80) : preloader.getAsDataURL(); // 得到图片src,实质为一个base64编码的数据
			    			callback && callback(imgsrc); // callback传入的参数为预览图片的url
			    			preloader.destroy();
			    			preloader = null;
		    		   };
		    		   
	    			    preloader.load( file.getSource() );
	    			   
	    			}
	    		}
	    		
	    }
	
	
	
	
}(sy||{}));