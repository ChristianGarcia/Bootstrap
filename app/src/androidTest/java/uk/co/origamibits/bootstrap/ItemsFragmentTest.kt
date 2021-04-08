package uk.co.origamibits.bootstrap

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.CoreMatchers.startsWith
import org.junit.Rule
import org.junit.Test

class ItemsFragmentTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun list() {
        onView(withId(R.id.itemsView))
            .check(matches(hasDescendant(withText(startsWith("Item 0")))))
    }

}