package com.example.moviesassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.moviesassignment.movies.Movie;
import com.example.moviesassignment.movies.movieAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ListView listView;
    private movieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("STRANGER THINGS" , "9/10" ,  "When a young boy vanishes, a small town uncovers a mystery involving secret experiments, terrifying supernatural forces and one strange little girl.",R.drawable.strangerthings));
        moviesList.add(new Movie("13 REASONS WHY" , "9/10" ,  "13 Reasons Why is an American teen drama streaming television series developed for Netflix by Brian Yorkey, based on the 2007 novel Thirteen Reasons Why by Jay Asher. The series revolves around high school student Clay Jensen and the aftermath of high school student Hannah Baker's suicide, who leaves behind a box of cassette tapes in which she details why she chose to end her life and the people she believes are responsible for her death., an already deadly mission approaches the impossible.",R.drawable.reasonswhy));
        moviesList.add(new Movie("MONEY HEIST" , "7/10" ,  "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain.",R.drawable.moneyheist));
        moviesList.add(new Movie( "GAME OF THRONES" , "8/10" ,  "An adaptation of author George R.R. Martin's \"A Song of Ice and Fire\" medieval fantasies about power struggles among the Seven Kingdoms of Westeros. In a world divided into four large continents, kingdoms try to seize control over the largest landmass of Westeros that starts at the very cold north pole and stretches down to a mixed terrain that ends at a desert-like south. The land Beyond the Wall and the Seven Kingdoms politically demarcate it, and they all fight for dominion.",R.drawable.gameofthrones));
        moviesList.add(new Movie("BREAKING BAD","9/10","Breaking Bad follows protagonist Walter White, a chemistry teacher who lives in New Mexico with his wife and teenage son who has cerebral palsy. White is diagnosed with Stage III cancer and given a prognosis of two years left to live. With a new sense of fearlessness based on his medical prognosis, and a desire to secure his family's financial security, White chooses to enter a dangerous world of drugs and crime and ascends to power in this world. The series explores how a fatal diagnosis such as White's releases a typical man from the daily concerns and constraints of normal society and follows his transformation from mild family man to a kingpin of the drug trade.",R.drawable.breakingbad));
        mAdapter = new movieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }

}