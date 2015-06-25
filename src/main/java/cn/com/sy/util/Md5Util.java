package cn.com.sy.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5���ܹ�����
 * @author Administrator
 *
 */
public class Md5Util {

    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
	
	public static String getMD5Decode(String md5){
		  char[] a = md5.toCharArray();  
		  for (int i = 0; i < a.length; i++) {  
		   a[i] = (char) (a[i] ^ 't');  
		  }  
		  String k = new String(a);  
		  return k; 
		
	}
	public static void main(String[] args) {
		
		String code = Md5Util.GetMD5Code("mobile");
		System.out.println(code);
		
	}
	
}
