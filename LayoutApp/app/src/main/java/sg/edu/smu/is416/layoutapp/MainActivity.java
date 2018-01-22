package sg.edu.smu.is416.layoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioButtonClick(View view) {
        int id = view.getId();

        ImageView iv = (ImageView) findViewById(R.id.superhero_image);
        TextView tv = (TextView) findViewById(R.id.uniqueID);
        if(id==R.id.camerica_button) {
            iv.setImageResource(R.drawable.captain_america);
            tv.setText("Captain America is a fictional character appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period. The popularity of superheroes waned following the war and the Captain America comic book was discontinued in 1950, with a short-lived revival in 1953.");
        } else if (id==R.id.ironman_button) {
            iv.setImageResource(R.drawable.ironman);
            tv.setText("Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963).\n" +
                    "\n" +
                    "A wealthy American business magnate, playboy, and ingenious scientist, Anthony Edward \"Tony\" Stark suffers a severe chest injury during a kidnapping in which his captors attempt to force him to build a weapon of mass destruction. He instead creates a powered suit of armor to save his life and escape captivity. Later, Stark augments his suit with weapons and other technological devices he designed through his company, Stark Industries. He uses the suit and successive versions to protect the world as Iron Man, while at first concealing his true identity. Initially, Iron Man was a vehicle for Stan Lee to explore Cold War themes, particularly the role of American technology and industry in the fight against communism.[1] Subsequent re-imaginings of Iron Man have transitioned from Cold War motifs to contemporary matters of the time.[1]");
        } else if (id==R.id.spiderman_button){
            iv.setImageResource(R.drawable.spiderman);
            tv.setText("Spider-Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer-editor Stan Lee and writer-artist Steve Ditko, and first appeared in the anthology comic book Amazing Fantasy #15 (August 1962) in the Silver Age of Comic Books. The character is conceived as an orphan within the Marvel Universe named Peter Parker being raised by his Aunt May and Uncle Ben in New York City after his parents Richard and Mary Parker were killed in a plane crash. Lee and Ditko depicted the character as having to deal with the normal struggles of adolescence and financial issues with a large array of supporting characters such as J. Jonah Jameson, Daily Bugle editor and smear campaigner of Spider-Man and classmates such as Flash Thompson, Harry Osborn and romantic interests, Gwen Stacy and Mary Jane Watson. His origin story depicts him as being bitten by an radioactive spider and spider related power and abilities, such as the ability to cling to most surfaces, shoot spider-webs using wrist-mounted devices of his own invention, which he calls \"web-shooters\", and react to danger quickly with his \"spider-sense\", enabling him to combat his many variety of superpowered foes such as Doctor Octopus, Green Goblin and Venom. Also within the origin, Spider-Man originally uses this power for stardom but after letting a burglar escape who is responsible for shooting his uncle, he learns to use his power responsibly.");
        } else if (id==R.id.thor_button) {
            iv.setImageResource(R.drawable.thor);
            tv.setText("Thor (Thor Odinson) is a fictional superhero appearing in American comic books published by Marvel Comics. The character, based on the Norse deity of the same name, is the Asgardian god of thunder and possesses the enchanted hammer Mjolnir, which grants him the ability to fly and manipulate weather amongst his other superhuman attributes.\n" +
                    "\n" +
                    "Debuting in the Silver Age of Comic Books, the character first appeared in Journey into Mystery #83 (Aug. 1962) and was created by editor-plotter Stan Lee, scripter Larry Lieber, and penciller-plotter Jack Kirby. He has starred in several ongoing series and limited series, and is a founding member of the superhero team the Avengers, appearing in each volume of that series. The character has also appeared in associated Marvel merchandise including animated television series, clothing, toys, trading cards, video games, and movies.");
        }

    }
}
