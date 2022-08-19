import java.io.IOException;

public class ExcelDemo extends Activity13_2a {

    public static void main(String args[]) throws IOException {
        //Prepare the path of excel file
        String filePath = "C:\\FSTProject\\FST_Selenium\\src\\main\\resources";

        //Create an object of current class
        Activity13_2a objExcelFile = new Activity13_2a();

        //Write the file using file name, sheet name and the data to be filled
        objExcelFile.writeExcel(filePath);

        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath);
    }
}