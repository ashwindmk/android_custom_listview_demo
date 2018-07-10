package ashwin.libraries.com.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        arrayOfUsers.add(new User("Alice", "Mumbai"));
        arrayOfUsers.add(new User("Brenda", "New York"));
        arrayOfUsers.add(new User("Clara", "Italy"));
        arrayOfUsers.add(new User("Daniel", "Australia"));
        arrayOfUsers.add(new User("Alice", "Mumbai"));
        arrayOfUsers.add(new User("Brenda", "New York"));
        arrayOfUsers.add(new User("Clara", "Italy"));
        arrayOfUsers.add(new User("Daniel", "Australia"));
        arrayOfUsers.add(new User("Alice", "Mumbai"));
        arrayOfUsers.add(new User("Brenda", "New York"));
        arrayOfUsers.add(new User("Clara", "Italy"));
        arrayOfUsers.add(new User("Daniel", "Australia"));
        arrayOfUsers.add(new User("Alice", "Mumbai"));
        arrayOfUsers.add(new User("Brenda", "New York"));
        arrayOfUsers.add(new User("Clara", "Italy"));
        arrayOfUsers.add(new User("Daniel", "Australia"));
        arrayOfUsers.add(new User("Alice", "Mumbai"));
        arrayOfUsers.add(new User("Brenda", "New York"));
        arrayOfUsers.add(new User("Clara", "Italy"));
        arrayOfUsers.add(new User("Daniel", "Australia"));
        UserAdapter adapter = new UserAdapter(this, R.layout.item_user, arrayOfUsers);
        listView.setAdapter(adapter);
    }
}
