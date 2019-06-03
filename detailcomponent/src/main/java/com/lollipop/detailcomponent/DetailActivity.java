package com.lollipop.detailcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lollipop.componentservice.router.ServiceRouter;
import com.lollipop.componentservice.service.ServiceListInterface;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvName = findViewById(R.id.tv_name);

        ServiceListInterface serviceListInterface = (ServiceListInterface) ServiceRouter.getInstance().getService(ServiceListInterface.class.getSimpleName());
        String name = serviceListInterface.getName();
        tvName.setText(name);
    }
}
