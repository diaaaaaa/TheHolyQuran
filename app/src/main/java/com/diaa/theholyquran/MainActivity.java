package com.diaa.theholyquran;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String[] urls = new String[]{
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0604.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0603.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0602.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0601.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0600.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0599.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0598.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0597.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0596.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0595.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0594.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0593.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0592.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0591.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0590.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0589.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0588.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0587.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0586.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0585.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0584.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0583.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0582.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0581.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0580.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0579.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0578.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0577.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0576.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0575.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0574.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0573.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0572.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0571.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0570.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0569.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0568.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0567.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0566.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0565.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0564.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0563.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0562.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0561.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0560.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0559.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0558.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0557.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0556.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0555.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0554.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0553.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0552.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0551.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0550.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0549.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0548.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0547.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0546.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0545.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0544.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0543.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0542.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0541.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0540.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0539.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0538.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0537.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0536.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0535.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0534.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0533.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0532.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0531.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0530.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0529.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0528.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0527.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0526.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0525.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0524.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0523.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0522.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0521.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0520.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0519.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0518.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0517.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0516.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0515.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0514.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0513.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0512.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0511.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0510.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0509.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0508.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0507.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0506.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0505.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0504.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0503.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0502.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0501.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0500.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0499.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0498.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0497.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0496.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0495.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0494.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0493.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0492.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0491.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0490.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0489.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0488.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0487.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0486.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0485.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0484.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0483.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0482.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0481.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0480.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0479.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0478.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0477.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0476.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0475.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0474.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0473.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0472.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0471.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0470.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0469.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0468.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0467.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0466.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0465.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0464.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0463.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0462.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0461.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0460.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0459.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0458.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0457.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0456.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0455.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0454.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0453.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0452.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0451.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0450.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0449.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0448.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0447.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0446.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0445.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0444.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0443.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0442.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0441.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0440.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0439.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0438.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0437.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0436.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0435.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0434.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0433.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0432.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0431.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0430.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0429.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0428.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0427.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0426.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0425.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0424.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0423.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0422.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0421.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0420.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0419.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0418.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0417.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0416.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0415.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0414.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0413.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0412.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0411.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0410.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0409.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0408.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0407.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0406.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0405.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0404.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0403.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0402.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0401.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0400.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0399.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0398.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0397.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0396.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0395.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0394.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0393.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0392.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0391.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0390.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0389.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0388.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0387.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0386.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0385.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0384.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0383.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0382.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0381.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0380.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0379.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0378.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0377.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0376.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0375.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0374.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0373.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0372.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0371.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0370.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0369.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0368.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0367.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0366.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0365.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0364.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0363.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0362.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0361.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0360.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0359.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0358.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0357.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0356.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0355.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0354.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0353.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0352.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0351.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0350.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0349.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0348.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0347.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0346.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0345.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0344.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0343.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0342.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0341.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0340.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0339.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0338.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0337.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0336.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0335.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0334.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0333.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0332.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0331.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0330.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0329.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0328.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0327.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0326.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0325.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0324.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0323.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0322.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0321.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0320.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0319.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0318.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0317.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0316.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0315.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0314.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0313.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0312.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0311.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0310.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0309.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0308.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0307.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0306.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0305.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0304.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0303.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0302.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0301.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0300.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0299.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0298.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0297.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0296.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0295.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0294.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0293.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0292.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0291.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0290.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0289.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0288.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0287.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0286.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0285.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0284.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0283.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0282.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0281.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0280.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0279.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0278.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0277.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0276.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0275.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0274.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0273.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0272.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0271.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0270.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0269.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0268.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0267.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0266.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0265.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0264.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0263.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0262.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0261.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0260.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0259.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0258.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0257.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0256.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0255.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0254.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0253.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0252.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0251.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0250.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0249.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0248.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0247.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0246.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0245.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0244.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0243.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0242.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0241.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0240.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0239.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0238.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0237.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0236.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0235.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0234.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0233.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0232.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0231.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0230.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0229.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0228.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0227.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0226.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0225.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0224.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0223.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0222.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0221.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0220.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0219.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0218.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0217.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0216.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0215.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0214.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0213.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0212.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0211.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0210.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0209.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0208.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0207.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0206.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0205.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0204.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0203.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0202.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0201.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0200.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0199.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0198.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0197.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0196.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0195.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0194.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0193.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0192.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0191.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0190.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0189.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0188.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0187.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0186.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0185.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0184.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0183.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0182.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0181.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0180.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0179.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0178.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0177.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0176.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0175.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0174.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0173.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0172.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0171.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0170.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0169.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0168.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0167.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0166.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0165.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0164.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0163.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0162.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0161.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0160.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0159.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0158.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0157.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0156.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0155.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0154.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0153.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0152.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0151.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0150.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0149.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0148.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0147.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0146.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0145.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0144.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0143.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0142.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0141.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0140.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0139.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0138.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0137.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0136.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0135.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0134.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0133.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0132.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0131.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0130.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0129.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0128.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0127.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0126.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0125.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0124.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0123.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0122.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0121.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0120.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0119.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0118.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0117.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0116.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0115.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0114.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0113.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0112.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0111.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0110.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0109.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0108.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0107.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0106.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0105.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0104.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0103.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0102.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0101.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0100.jpg",
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0099.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0098.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0097.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0096.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0095.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0094.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0093.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0092.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0091.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0090.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0089.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0088.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0087.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0086.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0085.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0084.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0083.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0082.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0081.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0080.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0079.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0078.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0077.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0076.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0075.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0074.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0073.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0072.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0071.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0070.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0069.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0068.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0067.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0066.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0065.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0064.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0063.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0062.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0061.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0060.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0059.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0058.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0057.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0056.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0055.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0054.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0053.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0052.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0051.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0050.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0049.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0048.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0047.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0046.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0045.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0044.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0043.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0042.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0041.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0040.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0039.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0038.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0037.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0036.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0035.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0034.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0033.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0032.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0031.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0030.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0029.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0028.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0027.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0026.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0025.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0024.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0023.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0022.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0021.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0020.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0019.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0018.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0017.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0016.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0015.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0014.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0013.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0012.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0011.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0010.jpg" ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0009.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0008.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0007.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0006.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0005.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0004.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0003.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0002.jpg"  ,
            "https://raw.githubusercontent.com/diaaaaaa/TheHolyQuran/master/app/src/main/assets/0001.jpg"
    };

String [] surahs = new String[] { "الفاتحة", "البقرة", "آل عمران", "النسآء",
            "المائدة", "الأنعام", "الأعراف", "الأنفال", "التوبة", "يونس", "هود",
            "يوسف", "الرعد", "إبراهيم", "الحجر", "النحل", "الإسراء", "الكهف",
            "مريم", "طه", "الأنبياء", "الحج", "المؤمنون", "النور‎", "الفرقان",
            "الشعراء", "النمل", "القصص", "العنكبوت", "الروم", "لقمان", "السجدة",
            "الأحزاب", "سبأ", "فاطر", "يس", "الصافات", "ص", "الزمر", "غافر",
            "فصلت", "الشورى", "الزخرف", "الدخان", "الجاثية", "الأحقاف", "محمد",
            "الفتح", "الحجرات", "ق", "الذاريات", "الطور", "النجم", "القمر",
            "الرحمن", "الواقعة", "الحديد", " المجادلة", "الحشر", "الممتحنة",
            "الصف", "الجمعة", "المنافقون", "التغابن", "الطلاق", "التحريم", "الملك",
            "القلم", "الحاقة", "المعارج", "نوح", "الجن", "المزمل", "المدثر",
            "القيامة", "الإنسان", "المرسلات", "النبأ", "النازعات","عبس",
            "التكوير", "الانفطار", "المطففين", "الانشقاق", "البروج", "الطارق",
            "الأعلى", "الغاشية", "الفجر", "البلد", "الشمس", "الليل", "الضحى",
            "الشرح", "التين", "العلق", "القدر", "البينة", "الزلزلة","العاديات",
            "القارعة", "التكاثر", "العصر", "الهمزة", "الفيل", "قريش", "الماعون",
            "الكوثر", "الكافرون", "النصر", "المسد", "الإخلاص", "الفلق", "الناس" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, urls);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(adapter.getCount());
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,surahs);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);
        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        ViewPager viewPager = findViewById(R.id.view_pager);
        switch (position){
            case 0:
                position=603;
                break;
            case 1:
                position=602;
                break;
            case 2:
                position=554;
                break;
            case 3:
                position=527;
                break;
            case 4:
                position=498;
                break;
            case 5:
                position=476;
                break;
            case 6:
                position=453;
                break;
            case 7:
                position=427;
                break;
            case 8:
                position=417;
                break;
            case 9:
                position=396;
                break;
            case 10:
                position=383;
                break;
            case 11:
                position=369;
                break;
            case 12:
                position=355;
                break;
            case 13:
                position=349;
                break;
            case 14:
                position=342;
                break;
            case 15:
                position=337;
                break;
            case 16:
                position=322;
                break;
            case 17:
                position=311;
                break;
            case 18:
                position=299;
                break;
            case 19:
                position=292;
                break;
            case 20:
                position=282;
                break;
            case 21:
                position=272;
                break;
            case 22:
                position=262;
                break;
            case 23:
                position=254;
                break;
            case 24:
                position=245;
                break;
            case 25:
                position=237;
                break;
            case 26:
                position=227;
                break;
            case 27:
                position=219;
                break;
            case 28:
                position=208;
                break;
            case 29:
                position=200;
                break;
            case 30:
                position=193;
                break;
            case 31:
                position=189;
                break;
            case 32:
                position=186;
                break;
            case 33:
                position=176;
                break;
            case 34:
                position=170;
                break;
            case 35:
                position=164;
                break;
            case 36:
                position=158;
                break;
            case 37:
                position=151;
                break;
            case 38:
                position=146;
                break;
            case 39:
                position=137;
                break;
            case 40:
                position=127;
                break;
            case 41:
                position=121;
                break;
            case 42:
                position=115;
                break;
            case 43:
                position=108;
                break;
            case 44:
                position=105;
                break;
            case 45:
                position=102;
                break;
            case 46:
                position=97;
                break;
            case 47:
                position=93;
                break;
            case 48:
                position=89;
                break;
            case 49:
                position=86;
                break;
            case 50:
                position=84;
                break;
            case 51:
                position=81;
                break;
            case 52:
                position=78;
                break;
            case 53:
                position=76;
                break;
            case 54:
                position=73;
                break;
            case 55:
                position=70;
                break;
            case 56:
                position=67;
                break;
            case 57:
                position=62;
                break;
            case 58:
                position=59;
                break;
            case 59:
                position=55;
                break;
            case 60:
                position=53;
                break;
            case 61:
                position=51;
                break;
            case 62:
                position=50;
                break;
            case 63:
                position=48;
                break;
            case 64:
                position=46;
                break;
            case 65:
                position=44;
                break;
            case 66:
                position=42;
                break;
            case 67:
                position=40;
                break;
            case 68:
                position=38;
                break;
            case 69:
                position=36;
                break;
            case 70:
                position=34;
                break;
            case 71:
                position=32;
                break;
            case 72:
                position=30;
                break;
            case 73:
                position=29;
                break;
            case 74:
                position=27;
                break;
            case 75:
                position=26;
                break;
            case 76:
                position=24;
                break;
            case 77:
                position=22;
                break;
            case 78:
                position=21;
                break;
            case 79:
                position=19;
                break;
            case 80:
                position=18;
                break;
            case 81:
                position=17;
                break;
            case 82:
                position=17;
                break;
            case 83:
                position=15;
                break;
            case 84:
                position=14;
                break;
            case 85:
                position=13;
                break;
            case 86:
                position=13;
                break;
            case 87:
                position=12;
                break;
            case 88:
                position=11;
                break;
            case 89:
                position=10;
                break;
            case 90:
                position=9;
                break;
            case 91:
                position=9;
                break;
            case 92:
                position=8;
                break;
            case 93:
                position=8;
                break;
            case 94:
                position=7;
                break;
            case 95:
                position=7;
                break;
            case 96:
                position=6;
                break;
            case 97:
                position=6;
                break;
            case 98:
                position=5;
                break;
            case 99:
                position=5;
                break;
            case 100:
                position=4;
                break;
            case 101:
                position=4;
                break;
            case 102:
                position=3;
                break;
            case 103:
                position=3;
                break;
            case 104:
                position=3;
                break;
            case 105:
                position=2;
                break;
            case 106:
                position=2;
                break;
            case 107:
                position=2;
                break;
            case 108:
                position=1;
                break;
            case 109:
                position=1;
                break;
            case 110:
                position=1;
                break;
            case 111:
                position=0;
                break;
            case 112:
                position=0;
                break;
            case 113:
                position=0;
                break;
        }


        viewPager.setCurrentItem(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}


