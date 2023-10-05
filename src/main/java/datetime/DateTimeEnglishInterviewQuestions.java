package datetime;

public class DateTimeEnglishInterviewQuestions {
    /*

    Explain the purpose of the DateTimeFormatter class in Java. How is it used to format and parse dates and times?

Answer: DateTimeFormatter is used to format and parse date and time objects to and from strings.
You can create custom formatting patterns or use predefined patterns like DateTimeFormatter.ISO_DATE for standard formatting.

What is the difference between LocalDate and ZonedDateTime?

Answer: LocalDate represents a date without a time component and without any time zone information.
ZonedDateTime represents a date and time with time zone information,
allowing you to work with dates and times in specific regions.

How can you calculate the difference between two dates in Java using the java.time package?

Answer: You can use the java.time.Duration class to calculate the difference between two LocalDateTime or Instant objects.
For date differences in years, months, and days, you can use the java.time.Period class.

What is the purpose of the Instant class in Java?

Answer: Instant is a class in the java.time package that represents a point in time on the global timeline,
independent of time zones. It is useful for tasks that require precise timekeeping, such as measuring time intervals.

Explain the difference between Period and Duration in Java's java.time package.

Answer: Period is used to represent a duration in terms of years, months, and days, suitable for date-based differences.
 Duration represents a time-based duration in hours, minutes, seconds, and nanoseconds.



     */
}
