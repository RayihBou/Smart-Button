package comrayihbou.github.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rayihButton = (Button)findViewById(R.id.rayihButton);

        rayihButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView rayihText = (TextView) findViewById(R.id.rayihText);
                        rayihText.setText("Excelente trabajo");
                    }
                }
        );

        rayihButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView rayihText = (TextView) findViewById(R.id.rayihText);
                        rayihText.setText("Click de larga duracion");
                        return true;
                    }
                }
        );


    }
}
