package com.eLLectron.ll_rogue;

import android.content.Context;
import android.widget.GridLayout;
import android.widget.ImageView;

public class Display {
	// TODO : Améliorer la fonction display avec la gestion de tous les cas
	public void displayMap(GridLayout tileMap, int[][] map, int player_y,
			int player_x, Context context) {

		/*
		 * Fonction d'affichage Double for sur les coordonnées de la map Switch
		 * sur le nombre contenu dans la case -> Affichage de l'image
		 * correspondante
		 */
		for (int y = -5; y < 7; y++) {
			for (int x = -9; x < 11; x++) {
				ImageView tile = new ImageView(context);

				switch (map[player_y + y][player_x + x]) {
				case 0:
					tile.setImageResource(R.drawable.buisson);
					break;
				case 1:
					tile.setImageResource(R.drawable.sol);
					break;
				}
				tileMap.addView(tile);
			}
		}

	}

	public void refresh(int[][] map, GridLayout tileMap, Player player,
			Context context) {
		tileMap.removeAllViews();
		displayMap(tileMap, map, player.y, player.x, context);
	}
}
