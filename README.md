#boot-scheduler
Scheduling Tasks using spring boot - Create a scheduled task

#The components that build a cron expression.

Seconds can have values 0-59 or the special characters , - * / .

Minutes can have values 0-59 or the special characters , - * / .

Hours can have values 0-59 or the special characters , - * / .

Day of month can have values 1-31 or the special characters , - * ? / L W C .

Month can have values 1-12, JAN-DEC or the special characters , - * / .

Day of week can have values 1-7, SUN-SAT or the special characters , - * ? / L C # .

Year can be empty, have values 1970-2099 or the special characters , - * / .

#Combined the breakdown into an expression consisting of the field labels.

@Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week] [Year]")

#Fires at 2 PM every day:
@Scheduled(cron = "0 0 02 * * ?")

#Fires at 10:15 AM every day in the year 2018:
@Scheduled(cron = "0 15 10 * * ? 2018")

#Fires every 10 seconds:
@Scheduled(cron = "0/10 * * * * ?")
