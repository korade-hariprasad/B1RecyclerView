package sumago.androidipt.b1recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView2;
    ArrayList<User> userArrayList;
    UserAdapter  userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView2=findViewById(R.id.recyclerView2);
        userArrayList=new ArrayList<>();
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView2.setLayoutManager(layoutManager);
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userArrayList.add(new User("Sachin",10,25,R.drawable.user));
        userAdapter=new UserAdapter(userArrayList);
        recyclerView2.setAdapter(userAdapter);
    }
}