package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherAndForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate a new layout that includes both weather and forecast fragments
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        // Add WeatherFragment
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.weather_fragment_container, new WeatherFragment());
        transaction.replace(R.id.forecast_fragment_container, new ForecastFragment());
        transaction.commit();

        return view;
    }
}

