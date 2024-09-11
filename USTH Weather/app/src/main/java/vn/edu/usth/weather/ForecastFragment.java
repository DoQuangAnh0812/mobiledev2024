package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(Color.parseColor("#20FF0000"));

        return view;


////        //Labwork 4
////        LinearLayout linearLayout = new LinearLayout(getContext());
////        linearLayout.setOrientation(LinearLayout.VERTICAL);
////
////        TextView textView = new TextView(getContext());
////        textView.setText("Thursday");
////
////        ImageView imageView = new ImageView(getContext());
////        imageView.setImageResource(R.drawable.cloudy);
////
////        linearLayout.addView(textView);
////        linearLayout.addView(imageView);
//
//        return linearLayout;
    }
}