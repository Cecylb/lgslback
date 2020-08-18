package cecylb.lgsl.lgslback.utils;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.*;

import java.io.ByteArrayOutputStream;

public final class Translator {

    public static byte[] translate(String input) {
        try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            //ToDo Обращение к tdf4j генератору, выборка значений, генерация компонентов, рендер пдф
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(writer);
            PdfPage page = pdfDocument.addNewPage();
            PdfCanvas canvas = new PdfCanvas(page);
            canvas.beginText().setFontAndSize(PdfFontFactory.createFont(), 70).moveText(100.0, 200.0).showText(input).endText();
            Color color = new DeviceRgb(0, 0, 0);
            canvas
                    .setStrokeColor(color)
                    .moveTo(36, 36)
                    .lineTo(36, 806)
                    .lineTo(559, 36)
                    .lineTo(559, 806)
                    .closePathStroke();
            pdfDocument.close();
            return outputStream.toByteArray();
        } catch (Exception e) {
            return e.toString().getBytes();
        }
    }
}
