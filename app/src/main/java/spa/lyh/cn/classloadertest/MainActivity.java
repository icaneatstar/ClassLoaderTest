package spa.lyh.cn.classloadertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClassLoader classLoader = getClassLoader();
        if (classLoader != null){
            Log.e("liyuhao","classloader:"+classLoader.toString());
            while (classLoader.getParent() != null){
                classLoader = classLoader.getParent();
                Log.e("liyuhao","classloader:"+classLoader.toString());
            }
        }
    }
}
