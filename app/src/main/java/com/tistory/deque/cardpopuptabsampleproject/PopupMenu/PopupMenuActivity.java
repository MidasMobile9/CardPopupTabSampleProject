package com.tistory.deque.cardpopuptabsampleproject.PopupMenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.tistory.deque.cardpopuptabsampleproject.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonPopup)
    public void onButtonPopupClick(View v){
        PopupMenu popupMenu = new PopupMenu(
                this,
                v); // anchor : 팝업을 띄울 기준될 위젯
        getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            //메뉴 클릭 리스너
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.popupMenu1:
                        return true;
                    case R.id.popupMenu2:
                        return true;
                    case R.id.popupMenu3:
                        return true;
                }
                return false;
            }
        });

        popupMenu.show(); // 메뉴를 띄우기
    }

}
