package wook.song.wooktesta;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/* Wook Song, 301047817, Section 002 */
public class SongActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        mTextView = (TextView) findViewById(R.id.text);
    }
}