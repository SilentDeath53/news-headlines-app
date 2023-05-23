data class NewsHeadline(val title: String, val description: String)

class NewsApp {
    private val headlines = mutableListOf<NewsHeadline>()

    fun addHeadline(headline: NewsHeadline) {
        headlines.add(headline)
    }

    fun displayHeadlines() {
        println("Latest News Headlines:")
        for ((index, headline) in headlines.withIndex()) {
            println("${index + 1}. ${headline.title}")
            println("   ${headline.description}")
            println()
        }
    }
}

fun main() {
    val newsApp = NewsApp()

    val headline1 = NewsHeadline("Breaking News 1", "This is the description of breaking news 1.")
    val headline2 = NewsHeadline("Breaking News 2", "This is the description of breaking news 2.")
    val headline3 = NewsHeadline("Breaking News 3", "This is the description of breaking news 3.")

    newsApp.addHeadline(headline1)
    newsApp.addHeadline(headline2)
    newsApp.addHeadline(headline3)

    newsApp.displayHeadlines()
}
