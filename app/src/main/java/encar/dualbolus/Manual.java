package encar.dualbolus;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

/**
 * Created by encar on 06/10/2016.
 */



public class Manual extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        //File fileBrochure = new File(Environment.getExternalStoragePublicDirectory("IeDiabetesPDFs").getPath()+"/PDF_pruebaNovo.pdf");

        //if (!fileBrochure.exists())
        {
            //CopyAssetsbrochure("PDF_pruebaNovo.pdf");
        }

        /** PDF reader code */
        File file = new File(Environment.getExternalStoragePublicDirectory("raw").getPath()+"/manual.pdf");

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(file),"application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        try
        {
            getApplicationContext().startActivity(intent);
        }
        catch (ActivityNotFoundException e)
        {
        }
    }




}
