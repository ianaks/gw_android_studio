package com.gw_android.guesswhat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Iana on 27.04.2015.
 */
public class RecordsActivity extends Activity{
    String[] names = { "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
            "Костя", "Игорь", "Анна", "Денис", "Андрей" };

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        // находим список
        ListView lstRecords;
        lstRecords = (ListView) findViewById(R.id.lstRecords);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.list_item_records, names);

        // присваиваем адаптер списку
        lstRecords.setAdapter(adapter);

    }
}
