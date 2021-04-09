package uk.co.origamibits.bootstrap

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.CoreMatchers.startsWith
import org.junit.Rule
import org.junit.Test

class ItemsFragmentTest {

    @Test
    fun list() {
        onView(withId(R.id.itemsView))
            .check(matches(hasDescendant(withText(startsWith("Item 0")))))
    }

    @Test
    fun name() {
        val scenario = launchFragmentInContainer<ItemFragment>()
    }
}