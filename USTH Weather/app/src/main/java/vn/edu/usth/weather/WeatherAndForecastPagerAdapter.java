package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAndForecastPagerAdapter extends FragmentPagerAdapter {

    public WeatherAndForecastPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getCount() {
        return 3; // Total number of pages
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Today";
            case 1:
                return "Tomorrow";
            case 2:
                return "Next Day";
            default:
                return null;
        }
    }
}