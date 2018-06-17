package com.example.oollan.temperatureconverter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(AndroidJUnit4.class)
public class ChangeTextText {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testConvertFahrenheitToCelsius() {
        onView(withId(R.id.edit_text))
                .perform(typeText("212"), closeSoftKeyboard());
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.edit_text)).check(matches(withText(containsString("100"))));
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        onView(withId(R.id.radio_fahrenheit)).perform(click());
        onView(withId(R.id.edit_text)).perform(typeText("100"), closeSoftKeyboard());
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.edit_text)).check(matches(withText(containsString("212"))));
    }
}