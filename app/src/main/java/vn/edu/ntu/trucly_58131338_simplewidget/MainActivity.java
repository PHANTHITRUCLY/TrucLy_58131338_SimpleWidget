package vn.edu.ntu.trucly_58131338_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh, edtThichKhac;
    RadioGroup rdgGioiTinh;
    CheckBox ckb1, ckb2, ckb3, ckb4, ckb5;
    Button btnXN;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews() {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaysinh);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        ckb1 = findViewById(R.id.ckb1);
        ckb2 = findViewById(R.id.ckb2);
        ckb3 = findViewById(R.id.ckb3);
        ckb4 = findViewById(R.id.ckb4);
        ckb5 = findViewById(R.id.ckb5);
        edtThichKhac = findViewById(R.id.edtThichKhac);
        btnXN = findViewById(R.id.btnXN);
    }
    private void addEvents() {
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XacNhan();
            }
        });
    }

    private void XacNhan() {
        String gioitinh=null, sothich="", sothichkhac=null;
        sothichkhac=edtThichKhac.getText().toString();
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rdbNam:
                gioitinh="Nam";
                break;
            case R.id.rdbNu:
                gioitinh="Nữ";
                break;
        }

        if (ckb1.isChecked()){
            sothich+=ckb1.getText().toString();
            sothich+="; ";

        }
        if (ckb2.isChecked()){
            sothich+=ckb2.getText().toString();
            sothich+="; ";
        }
        if (ckb3.isChecked()){
            sothich+=ckb3.getText().toString();
            sothich+="; ";
        }
        if (ckb4.isChecked()){
            sothich+=ckb4.getText().toString();
            sothich+="; ";
        }
        if (ckb5.isChecked()){
            sothich+=ckb5.getText().toString();
            sothich+="; ";
        }
        sothich+=sothichkhac;

        if (sothich.length()==0){
            sothich="Không có";
        }
        String HienThi = edtTen.getText().toString()+"\nNgày sinh: "+edtNgaySinh.getText().toString()+"\nGiới tính: "+gioitinh+"\nSở thích: "+sothich;
        Toast.makeText(getApplicationContext(),HienThi,Toast.LENGTH_SHORT).show();
    }
}
