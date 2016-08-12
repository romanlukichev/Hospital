package reporting;



/**
 * Created by Roman on 07.08.2016.
 */
public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object , FormatType formatType){
             switch (formatType){
                 case XML:
                    formattedOutput =  convertObjectToXML(object);
                     break;
                 case CSV:
                     formattedOutput = convertObjectToCSV(object);
                     break;

             }
    }

    private String convertObjectToXML(Object inObject){   // argument can be any object because the Object is the parent of any object.
        return "XML: <title>" + inObject.toString() + "</title>";
    }

    private String convertObjectToCSV(Object inObject){
        return "XML: ,,," + inObject.toString() + ",,,,";
    }

    public String getFormattedValue(){
        return formattedOutput;
    }

}
