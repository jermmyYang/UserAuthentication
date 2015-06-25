package cn.com.sy.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * ����У���빤��
 * 
 * @author Administrator
 *
 */
public class ImageGenerateUtil {

	private static char mapTable[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9' };

	/**
	 * ����:���ɲ�ɫ��֤��ͼƬ ����widthΪ����ͼƬ�Ŀ��,����heightΪ����ͼƬ�ĸ߶�,����osΪҳ��������
	 */
	public static String getCertPic(int width, int height, OutputStream os) {
		if (width <= 0)
			width = 80;
		if (height <= 0)
			height = 30;
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		// ��ȡͼ��������
		Graphics g = image.getGraphics();
		// �趨����ɫ
		g.setColor(new Color(0xDCDCDC));
		g.fillRect(0, 0, width, height);
		// ���߿�
		g.setColor(Color.black);
		g.drawRect(0, 0, width - 1, height - 1);
		// ȡ�����������֤��
		String strEnsure = "";
		// 4����4λ��֤��,���Ҫ���ɸ���λ����֤��,��Ӵ���ֵ
		for (int i = 0; i < 4; ++i) {
			strEnsure += mapTable[(int) (mapTable.length * Math.random())];
		}
		// ��������֤����ʾ��ͼ����,���Ҫ���ɸ���λ����֤��,����drawString���
		g.setColor(Color.black);
		g.setFont(new Font("Atlantic Inline", Font.PLAIN, 18));
		String str = strEnsure.substring(0, 1);
		g.drawString(str, 10, 20);
		str = strEnsure.substring(1, 2);
		g.drawString(str, 25, 15);
		str = strEnsure.substring(2, 3);
		g.drawString(str, 40, 18);
		str = strEnsure.substring(3, 4);
		g.drawString(str, 55, 15);
		// �������10�����ŵ�
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int x = rand.nextInt(width);
			int y = rand.nextInt(height);
			g.drawOval(x, y, 1, 1);
		}
		// �ͷ�ͼ��������
		g.dispose();
		try {
			// ���ͼ��ҳ��
			ImageIO.write(image, "JPEG", os);
		} catch (IOException e) {
			return "";
		}
		return strEnsure;
	}
	
	public static void main(String[] args) {
		
		/*ImageGenerateUtil.getCertPic(0, 0, os)*/
		
	}

}
