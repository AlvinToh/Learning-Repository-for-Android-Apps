package sg.edu.smu.is416.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static String[] list = {
            "word 1", "definition 1",
            "word 2", "definition 2",
            "word 3", "definition 3"
    };

    private Map<String,String> dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.words_list);
        dictionary = new HashMap<>();

        for(int i = 0; i < list.length; i+=2){
            dictionary.put(list[i], list[i+1]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, //context
                android.R.layout.simple_list_item_1,
                new ArrayList<String> (dictionary.keySet()) //items
        );
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String theClickedWord = adapterView.getItemAtPosition(i).toString();
                String theDefinition = dictionary.get(theClickedWord);
                Toast.makeText(MainActivity.this, theDefinition, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
