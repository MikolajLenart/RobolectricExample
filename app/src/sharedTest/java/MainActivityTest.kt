package co.netguru.robolectrictest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun exampledTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.textView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Awsome ! You have clicked")))
    }
}