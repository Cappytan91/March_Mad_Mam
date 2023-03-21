import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class CreateExcelFile {

    public XSSFWorkbook workbook;
    public XSSFSheet sheet;

    public ArrayList<Mammal> animals;
    public ArrayList<Mammal> animals1;
    public ArrayList<Mammal> animals2;

    public static void main(String[] args) throws IOException {

        CreateExcelFile n = new CreateExcelFile();
        //Object[][] bookData = new Object[][]{{"Hio", "Bio"}, {"Bio", 1}};







    }

    public CreateExcelFile(){
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Java Books");
        Text2Bracket.convert();
        this.animals = Text2Bracket.getAnimals();

        createSheet();
        fillSheet();

        try (FileOutputStream outputStream = new FileOutputStream("aaaaaaaaaaa.xlsx")) {
            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillSheet() {
        Random random = new Random();

        for (int i = 0; i < animals.size(); i++) {
            if(i % 2 == 0){
                animals1.add(animals.get(i));
            }else{
                animals2.add(animals.get(i));
            }
        }

        for (int i = 0; i < animals1.size(); i++) {
            int winQuestionmark = random.nextInt(1);

        }

    }

    public void createSheet(){



        for (int i = 0; i < 64; i++) {
            Row row = sheet.createRow(i);


            for (int j = 0; j < 13; j++) {

                Cell cell = row.createCell(j);
                //cell.setCellValue("");

            }

        }
    }

    public void fillCell(String input, int x, int y){
        sheet.getRow(y).getCell(x).setCellValue(input);
    }

}