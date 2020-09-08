package cecylb.lgsl.lgslback.utils;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.*;
import io.github.tdf4j.core.module.LexerAbstractModule;
import io.github.tdf4j.generator.Generator;
import io.github.tdf4j.generator.Options;
import io.github.tdf4j.generator.impl.ParserGenerator;
import io.github.tdf4j.lexer.Lexer;
import io.github.tdf4j.lexer.LexerImpl;
import io.github.tdf4j.parser.Parser;
import io.github.tdf4j.parser.ParserMetaInformation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public final class Translator {

    public static byte[] translate(String input) {
        try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {


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


    private static String read(final InputStream inputStream) throws IOException {
        final StringWriter writer = new StringWriter();
        int bt;
        while((bt = inputStream.read()) != -1) {
            writer.write(bt);
        }
        return writer.toString();
    }
}
