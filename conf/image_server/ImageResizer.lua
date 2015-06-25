local io = require("io"); 

local baseServerDir = ngx.var.baseDir
local imageDimension=ngx.var.width .. "x" .. ngx.var.height;
local srcPath = ngx.var.storagePath.."/"..ngx.var.requestFilePath.."."..ngx.var.ext;
local destPath = ngx.var.storagePath.."/thumbnail/"..ngx.var.requestFilePath.."_"..ngx.var.width.."x"..ngx.var.height.."."..ngx.var.ext;

function file_exists(path)
  local file = io.open(path, "r");
  if file then file:close() end
  return file ~= nil
end

local command = baseServerDir.."/conf/image_server/MakeImage.sh "..imageDimension.." "..srcPath.." "..destPath.." "..ngx.var.ext;
ngx.log(ngx.ERR,command);
if file_exists(srcPath) then
    os.execute("mkdir -p "..ngx.var.storagePath.."/thumbnail/"..ngx.var.requestFileDate.."/"..ngx.var.requestEventId);
	local x = os.execute(command);
	ngx.exec("/thumbnail/"..ngx.var.uri);
else
	ngx.exit(404);
end; 
