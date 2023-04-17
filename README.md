# Mobile Apps 1 CA2

- Student Name: MARCELO Ferreira Neto
- Student ID: 25708
- Course: Your course

## Requirement Checklist

- [x] 1. com.example.mobileapps1.Movie recycler view:
  - [x] 1.1. Create a com.example.mobileapps1.Movie class with the structure specified in movie.json (provided on Moodle)
  - [x] 1.2. Obtain and fill data (minimum of 4 movies)
    - [x] 1.2.1. Obtain relevant movie data from Vue (https://www.myvue.com/cinema/dublin/whats-on) or your favourite provider and add data credits at the bottom of the app
    - [x] 1.2.2. Generate a random number between 0 and 15 for each movie and assign to seats_remaining
    - [x] 1.2.3. Start with an initial default seats_selected value of 0 for all movies
    - [x] 1.2.4. You shall fill random URLs for images from pixabay or other free image providers to begin with
  - [x] 1.3. Build a Recycler View using the specified template, refer to recycler_view_template_*.jpg (provided on Moodle)
  - [x] 1.4. If any seats are selected, show how many seats are selected and hide remaining seats
- [ ] 2. Seat selection feature:
  - [x] 2.1. Clicking any item (anywhere on the item) on the movie recycler view should open a new MovieActivity, refer to movie_activity_*.jpg (provided on Moodle)
  - [ ] 2.2. Add plus and minus icons, show seats_selected in the middle
  - [ ] 2.3. On click plus/minus, update both seats_selected and seats_remaining for that movie
  - [ ] 2.4. Add validation, when 0 seats selected minus is disabled, when 0 seats remaining plus is disabled
  - [ ] 2.5. When back is pressed, the selected seats are retained and reflected in the recycler view. (Hint: If you don’t see any updates, call adapter notifyItemChanged as soon as you return to the recycler view activity)
- [ ] 3. Bonus:
  - [ ] 3.1. Add "filling fast" badge if less than 3 seats remaining
  - [ ] 3.2. Use "Roboto Condensed" font to replicate same style
  - [x ] 3.3. Use original movie images from myvue.com or your favourite provider (Hint: check get_movie_image_url.gif (provided on Moodle))

## Additional Features implemented

This is an optional section, feel free to remove this.

## Report

Title: Android Application Development Experience and Overview of Attempted Project
Introduction: This report presents my experience in attempting to develop an Android application using Android Studio, as per the guidelines set by Professor Saravanabalagi Ramachandran. As a beginner in IT and mobile programming, I encountered numerous challenges during this project, and despite my best efforts, I could not generate a working APK or visualize the completed app.
Challenges: The Android Studio environment presented a steep learning curve for me, as I was unfamiliar with many of the components and functions required for this project. My classmates and I have only been exposed to a basic level of Java programming, which made it difficult for us to comprehend the intricate details requested by the professor.
Failed Attempts and Workarounds: I spent countless hours attempting to include the necessary components in Android Studio but repeatedly encountered errors that prevented me from making progress. I tried various ways to correct the code but was ultimately unsuccessful. To improve my understanding and complete the project, I utilized several online resources, such as YouTube tutorials and an online course from Alura, a Brazilian online course platform.
Resources Used:
1. YouTube videos:
      a. MOVIES APP - RETROFIT, GLIDE, RECYCLERVIEW AND MOVIEDB API PT 1 (https://www.youtube.com/watch?v=qt3WCP-_uaY)
      b. MOVIES APP - RETROFIT, GLIDE, RECYCLERVIEW AND MOVIEDB API PT 2 (https://www.youtube.com/watch?v=OOLFhtyCspA)
      c. MOVIES APP - RETROFIT, GLIDE, RECYCLERVIEW AND MOVIEDB API PT 3 (https://www.youtube.com/watch?v=4Gd2PIzU3zE)
2. Alura online course (https://cursos.alura.com.br/)
3. Vue Cinema (Movie posters and info) https://www.myvue.com/cinema/dublin/whats-on
4. PNG Images (+ and -) https://www.pngwing.com/en 

Learning Outcomes: Through my struggles, I gained valuable insight into the difficulties faced by beginners in the field of mobile programming. I also discovered the importance of perseverance and resourcefulness in overcoming these challenges. This experience has provided me with a deeper understanding of the complexities involved in developing Android applications using Android Studio.

Request for Consideration: In light of my experiences, I respectfully request that Professor Saravanabalagi Ramachandran consider the challenges I faced in attempting to complete this project. While I was unable to fulfill all the requirements, I devoted significant time and effort to learning and understanding the material. I am confident that with further guidance and support, I will be able to improve my skills and accomplish more advanced tasks in the future.

Future Commitment: For the next project, I commit to allocating even more time to study and practice, ensuring that I can perform better and meet the expected requirements. I believe that with dedication and hard work, I can overcome the obstacles I faced during this project and successfully develop Android applications using Android Studio.

Project Overview and Code Explanation: This report also provides an overview and explanation of the code I have attempted for an Android app project. The code includes classes for a Movie, MainActivity, MovieDetailsActivity, and MovieListAdapter. The project aims to display a list of movies and allow users to select and purchase tickets for a specific movie.

1.	Movie Class: The Movie class defines the properties of a movie, including ID, title, description, genre, actors, image URL, running time, show times, and available seats.
2.	MainActivity: The MainActivity class sets up the RecyclerView and calls the fetchMovies() method to retrieve data from an external source.
3.	MovieDetailsActivity: The MovieDetailsActivity class displays the details of a specific movie and allows users to select seats.
4.	MovieListAdapter: The MovieListAdapter class populates the RecyclerView with movies and handles the onClick event to start the MovieDetailsActivity.

Although I did not complete the app, the provided code demonstrates my attempt to create an Android app that displays movie information and allows users to select seats. The code showcases the use of various Android libraries such as Gson, Glide, and RecyclerView. Overall, the code demonstrates an understanding of Android app development concepts and a willingness to learn and explore new technologies.

Conclusion:
Despite the setbacks, I remain committed to learning and improving my Android Studio skills. The experience has taught me the importance of perseverance and resourcefulness in overcoming challenges. I am confident that with further guidance, support, and dedication, I will be able to improve my skills, overcome the obstacles faced during this project, and successfully develop Android applications using Android Studio in the future.

In conclusion, I respectfully request Professor Saravanabalagi Ramachandran to consider the challenges I faced during this project and appreciate the time and effort I have invested in learning and understanding the material. My commitment to study and practice will ensure better performance in future projects, ultimately leading to successful Android application development using Android Studio.




## APK Releases

1. Add your release name and update this [link](https://example.org)