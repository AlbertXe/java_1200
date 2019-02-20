package chap17_file.pdf;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfTest {
	public static void main(String[] args) throws Exception {
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Administrator.C64-20171130OTM\\Desktop\\Hello.pdf"));
		document.open();
		document.add(new Paragraph("Hello to new Paragraph"));

		// set attributes
		document.addAuthor("xie");
		document.addCreationDate();
		document.addCreator("how to do ");
		document.addTitle("set attributes");
		document.addSubject("a example show how to do ");

		// add Image
		Image image = Image.getInstance("C:\\Users\\Administrator.C64-20171130OTM\\Desktop\\a.PNG");// 本地图片
		// image.setAbsolutePosition(100, 300);
		document.add(image);

		// 网络图片
		Image image2 = Image.getInstance(new URL("http://img3.redocn.com/tupian/20160108/lvsehuahuizhizhangfanyexiaoguobeijingsucai_5728265.jpg"));
		image2.scaleAbsolute(500, 500);
		document.add(image2);

		document.close();
		writer.close();

	}
}
