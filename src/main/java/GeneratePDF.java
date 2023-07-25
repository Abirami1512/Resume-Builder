

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

/**
 * Servlet implementation class GeneratePDF
 */
@WebServlet(name="GeneratePDF",urlPatterns={"/generatePdf"})
public class GeneratePDF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePDF() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/pdf");
		try  {
			Document document = new Document(); //create new doc
			PdfWriter.getInstance(document, response.getOutputStream()); //write to outputstream
			document.open();
			
			//getting contents
			String name = request.getParameter("fullname");
			String qual = request.getParameter("qualification");
			String mobile = request.getParameter("mobno");
     		String email = request.getParameter("email");
			String media = request.getParameter("media");
			String skill1 = request.getParameter("skill1");
			String skill2 = request.getParameter("skill2");
			String skill3 = request.getParameter("skill3");
			String skill4 = request.getParameter("skill4");
			String skill5 = request.getParameter("skill5");
			String ach1 = request.getParameter("ach1");
			String ach2 = request.getParameter("ach2");
			String desc1 = request.getParameter("desc1");
			String desc2 = request.getParameter("desc2");
			String proj1 = request.getParameter("p1");
			String proj2 = request.getParameter("p2");
			String duration1 = request.getParameter("dur1");
			String duration2 = request.getParameter("dur2");
			String tech1 = request.getParameter("tech1");
			String tech2 = request.getParameter("tech2");
			String pdesc1 = request.getParameter("pdesc1");
			String pdesc2 = request.getParameter("pdesc2");
			String summary = request.getParameter("summary");
			String format = request.getParameter("format");
			
			
			if (format.equals("single column"))  {
				//single column
				Font titlefont = new Font(FontFamily.TIMES_ROMAN, 36, Font.BOLD, new BaseColor(50, 145, 164));
				Font projecttitle = new Font(FontFamily.TIMES_ROMAN, 15, Font.BOLD, new BaseColor(0, 0, 0));
				Font sectionhead= new Font(FontFamily.TIMES_ROMAN, 17, Font.BOLD, new BaseColor(50, 145, 164));
				Paragraph para = new Paragraph(name+"", titlefont);
				para.setAlignment(Paragraph.ALIGN_CENTER);
				para.setLeading(10);
				document.add(para);
				Font parafont = new Font(FontFamily.TIMES_ROMAN, 12, Font.NORMAL, new BaseColor(0, 0, 0));
				Font sumfont = new Font(FontFamily.TIMES_ROMAN, 13, Font.ITALIC, new BaseColor(0, 0, 0));
//				qual = qual.toUpperCase();
				LineSeparator ls = new LineSeparator(0, 95,new BaseColor(50, 145, 164) ,0, 0);
				document.add(new Chunk(ls));
				
				//summary
				para = new Paragraph("\t"+summary, sumfont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				//para.setIndentationLeft(20);
				document.add(para);
				
				
				document.add(new Chunk(ls));
				// contact info
				para = new Paragraph("\tContact", sectionhead);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				document.add(para);
				
				
				para = new Paragraph("\t"+mobile, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+email, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+media, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				
				document.add(new Chunk(ls));
				
				//skills
				para = new Paragraph("Skills", sectionhead);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				document.add(para);
				
				
				para = new Paragraph("\t"+skill1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+skill2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+skill3, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+skill4, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+skill5, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				document.add(new Chunk(ls));
				
				//Project
				para = new Paragraph("Projects / Internship", sectionhead);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				document.add(para);
				
				
				para = new Paragraph("\t"+proj1, projecttitle);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+duration1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+pdesc1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				para = new Paragraph("Technologies used: "+tech1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				para = new Paragraph("\t"+proj2, projecttitle);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				para.setSpacingBefore(15);
				document.add(para);
				
				para = new Paragraph("\t"+duration2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+pdesc2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				para = new Paragraph("Technologies used: "+tech2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				document.add(new Chunk(ls));
				
				// Achievements
				para = new Paragraph("Achievements", sectionhead);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				document.add(para);
				
				
				para = new Paragraph("\t"+ach1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+desc1, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				para = new Paragraph("\t"+ach2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setSpacingBefore(15);
				para.setIndentationLeft(40);
				document.add(para);
				
				para = new Paragraph("\t"+desc2, parafont);
				para.setAlignment(Paragraph.ALIGN_LEFT);
				para.setIndentationLeft(80);
				document.add(para);
				
				document.add(new Chunk(ls));	
				 
				 
				
			}
			else  {
				//double column
				
				Font titlefont = new Font(FontFamily.HELVETICA, 36, Font.BOLD, new BaseColor(0, 51, 91));
				Paragraph para = new Paragraph(name+"", titlefont);
				para.setAlignment(Paragraph.ALIGN_CENTER);
				document.add(para);
				Font parafont = new Font(FontFamily.HELVETICA, 14, Font.ITALIC, new BaseColor(0, 51, 91));
				para = new Paragraph(""+qual, parafont);
				para.setAlignment(Paragraph.ALIGN_CENTER);
				document.add(para);
				parafont = new Font(FontFamily.HELVETICA, 12, Font.ITALIC, new BaseColor(0, 0, 0));
				para = new Paragraph(summary+ "\n", parafont);
				
				para.setAlignment(Paragraph.ALIGN_CENTER);
				document.add(para);
				LineSeparator ls = new LineSeparator();
				document.add(new Chunk(ls));
				Font f2 = new Font(FontFamily.TIMES_ROMAN, 14, Font.BOLD, new BaseColor(0, 0, 0));
				Font f3 = new Font(FontFamily.TIMES_ROMAN, 12, Font.NORMAL, new BaseColor(0, 0, 0));
				parafont = new Font(FontFamily.TIMES_ROMAN, 16, Font.BOLD, new BaseColor(0, 51, 91));
				para = new Paragraph("Contact\n",parafont) ;
				Paragraph p1 = new Paragraph("Mobile:" + mobile,f3) ;
				Paragraph p2 = new Paragraph("Email:" + email,f3) ;
				para.add(p1);para.add(p2);
				p2 = new Paragraph("Media:" + media,f3) ;
				para.add(p2);
				//para.setLeading(60f);
				document.add(para);
				Paragraph para2, para3;
				
				ls = new LineSeparator();
				document.add(new Chunk(ls));
				
				PdfPTable table = new PdfPTable(2);
				PdfPCell cell;
				table.setWidthPercentage(100);
				
				
				para = new Paragraph("Skills" + "\n\n", parafont);
				para2 = new Paragraph(skill1 + "\n" + skill2+"\n" + skill3+"\n" + skill4+"\n" + skill5,new Font(FontFamily.TIMES_ROMAN, 14, Font.NORMAL, new BaseColor(0, 0, 0))) ;
				para.add(para2);
				
				cell = new PdfPCell(para);
				cell.setBorderColor(BaseColor.WHITE);
				table.addCell(cell);
				
				
				para = new Paragraph("Project / Internship " + "\n\n", parafont) ;
				para2 = new Paragraph(proj1 + "\n\n",f2) ;
				para3 = new Paragraph(duration1 +"\n", f3) ;
				para3.setAlignment(Paragraph.ALIGN_RIGHT);
				para.add(para2);para.add(para3);
				para3 = new Paragraph(pdesc1 +"\n",f3) ;
				para3.setLeading(600,0);
				para.add(para3);
				para3 = new Paragraph("Technologies: " +tech1 +"\n\n",f3) ;
				para.add(para3);
				cell = new PdfPCell(para);
//				cell.setRowspan(2);
				cell.setBorderColor(BaseColor.WHITE);
				table.addCell(cell);
				//ach
				para = new Paragraph("Achievements" + "\n\n", parafont) ;
				para2 = new Paragraph(ach1 + "\n\n",f2) ;
				para3 = new Paragraph(desc1 +"\n\n",f3) ;
				para.add(para2);para.add(para3);
				
				
				para2 = new Paragraph(ach2 + "\n\n",f2) ;
				para3 = new Paragraph(desc2 +"\n",f3) ;
				para.add(para2);para.add(para3);
				cell = new PdfPCell(para);
				cell.setBorderColor(BaseColor.WHITE);
				table.addCell(cell);
				
				
				
				//2nd project
				para = new Paragraph("Project / Internship " + "\n\n", parafont) ;
				para2 = new Paragraph(proj2 + "\n\n",f2) ;
				para3 = new Paragraph(duration2 +"\n",f3) ;
				para.add(para2);para.add(para3);
				para3 = new Paragraph(pdesc2 +"\n",f3) ;
				para.add(para3);
				para3 = new Paragraph("Technologies: " +tech2 +"\n",f3) ;
				para.add(para3);
				cell = new PdfPCell(para);
				cell.setBorderColor(BaseColor.WHITE);
				table.addCell(cell);
				document.add(table);
			}
		    
		   
//		   
//		    PdfPTable table = new PdfPTable(2); //2 columns
//		    PdfPCell cell;
//		    cell = new PdfPCell(new Phrase("Header"));
//		    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
//		    cell.setBorderColor(BaseColor.LIGHT_GRAY);
//		    cell.setColspan(2);
//		    table.addCell(cell);
//		    
//		    document.add(table);
			document.close();
			
		}
		catch(Exception e)  {
			e.printStackTrace();
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
