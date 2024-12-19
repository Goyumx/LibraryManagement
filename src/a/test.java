package a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.BookCategoryController;
import controller.BookController;
import controller.BookProcess;
import controller.MemberController;
import dao.custom.BookBorrowDao;
import dto.BookBorrowDetailDto;
import dto.BookBorrowDto;
import dto.BookCategoryDto;
import dto.BookDto;
import dto.MemberDto;
import java.util.ArrayList;
/**
 *
 * @author goyum
 */
public class test {
    private BookController x;
    private BookCategoryController y;
    private MemberController z;
    private BookProcess t;
    private ArrayList<BookBorrowDetailDto> bookBorrowDetailDtos;
    
   
    
    public test() throws Exception{
        x= new BookController();
        y = new BookCategoryController();
        z = new MemberController();
        t = new BookProcess();
        bookBorrowDetailDtos = new ArrayList<>();
    }

    
    
    
    
    public void print( ){
        try {
            
            
          //  BookBorrowDetailDto e = new BookBorrowDetailDto("H001", "BK001", "2025-2-2");
         //   bookBorrowDetailDtos.add(e);
            
           // BookBorrowDto b = new BookBorrowDto("H002", "M002", "2025-2-1", "2025-2-2", null, 0, bookBorrowDetailDtos);
            String resp =t.returnBook("H001", 700.0);
          //  String resp = t.borrowBook(b);
            //ArrayList<MemberDto> members =z.getAll();
            //ArrayList<BookCategoryDto>  ddd =y.getAll();
            
            //BookCategoryDto goo = y.get("CT001");
            //MemberDto members=z.get("M001");
            
            //BookDto aluth = new BookDto("BK003", "History", "CT001", "Peak history lessons", "Available");
            //MemberDto members=new MemberDto("M003", "Gunapala hewa", "+94 78 8899664", "1998-6-3", "E3/1,Market Road,Kochcikade");
            
            //String resp=x.save(aluth);
            //String resp=z.save(members);
            
            //ArrayList<BookDto> bkkk = x.getAll();
            //BookDto bookDto =x.get("BK001");
            
            //String BK="BK001";
            //String BC ="CT001";
            //String resp=y.delete(BC);
            //String resp =x.delete(BK);
            
            
            //System.out.println(bkkk +"\n"+bookDto+"\n"+ddd);
            //System.out.println(goo);
            //System.out.println("dfdfdf");
            System.out.println(resp);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
