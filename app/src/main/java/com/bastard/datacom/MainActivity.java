package com.bastard.datacom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
	
	private Button button_quiz;
	private NavigationView navigationView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button_quiz = findViewById(R.id.button);
		navigationView = findViewById(R.id.nav_View);

		navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {

				//if(item.getItemId().R.id.nav_exams)

				switch (item.getItemId())
				{
					case R.id.nav_exams:
						Toast.makeText(this, "Exams", Toast.LENGTH_LONG).show();
						break;

					case R.id.nav_home:
						Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
						break;

					case R.id.nav_share:
						Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
						break;

					case R.id.nav_classes:
						Toast.makeText(this, "Class TimeTable", Toast.LENGTH_SHORT).show();

				}
			}
				return false;
			}
		})

	}
}