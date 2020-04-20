
package PAIM;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.text.Document;
import sun.applet.Main;

public class pdf {
 
  private File ruta_destino=null;
    
    public pdf(){    
    }
    
    /* metodo que hace uso de la clase itext para manipular archivos PDF*/
    public void crear_PDF(String filename) throws IOException, DocumentException{
        //abre ventana de dialogo "guardar"
        
        Colocar_Destino();
        //si destino es diferente de null
        
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document() ;
                Image imagen = Image.getInstance("reporte.png");
                imagen.scaleAbsolute(800,555); //tamaño de la Imagen en el pdf
               
                //posicion de la Imagen en el PDF
                imagen.setAlignment(Chunk.ALIGN_MIDDLE); //centrar la imagen 

                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf")); 
               imagen.setRotationDegrees(90f); //rotacion de la imagen 
               
                 
                mipdf.open();// se abre el documento
               
               
                // contendio del PDF
               mipdf.add(imagen);
               
                mipdf.close(); //se cierra el PDF
                
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } 
            
            catch (DocumentException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }        
    }
    
    
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
        
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){   
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }    
}

