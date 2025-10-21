package com.codingame.game;

import com.codingame.gameengine.module.entities.World;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Class will store all the required constants.
 */
public class Constants {
    // Define view height and width.
    public static final int VIEWER_WIDTH = World.DEFAULT_WIDTH;
    public static final int VIEWER_HEIGHT = World.DEFAULT_HEIGHT;

    // Define a tile size and offset.
    public static final int CELL_SIZE = 256;
    public static final int CONNECTOR_WIDTH = 64;
    public static final int CONNECTOR_OFFSET= Constants.CELL_SIZE/2 - CONNECTOR_WIDTH/2;

    // Background Sprite.
    public static final String BACKGROUND_SPRITE = "bg.png";

    // Regular and error tile sprites.
    public static final String TILE_SPRITE = "tile.png";
    public static final Map<Character, String> ERROR_TILE_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        map.put('.', "tileError.png");
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c,"tile"+c+"Error.png");
        }
        map.put('a',"tilea"+"Error.png");
        map.put('b',"tileb"+"Error.png");
        map.put('c',"tilec"+"Error.png");
        map.put('d',"tiled"+"Error.png");
        map.put('e',"tilee"+"Error.png");

        map.put('X', "blockerError.png");
        map.put('V', "tileVerticalError.png");
        map.put('H', "tileHorizontalError.png");
        ERROR_TILE_MAPPER = Collections.unmodifiableMap(map);
    }

    // Checkpoint tile mapper.
    public static final Map<Character, String> CHECKPOINT_TILE_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "tile"+c+"Checkpoint.png");
        }
        // Letters
        map.put('a',"tilea"+"Checkpoint.png");
        map.put('b',"tileb"+"Checkpoint.png");
        map.put('c',"tilec"+"Checkpoint.png");
        map.put('d',"tiled"+"Checkpoint.png");
        map.put('e',"tilee"+"Checkpoint.png");
        CHECKPOINT_TILE_MAPPER = Collections.unmodifiableMap(map);
    }

    // Checkpoint error mapper.
    public static final Map<Character, String> ERROR_CHECKPOINT_TILE_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "tile"+c+"CheckpointError.png");
        }
        // Letters
        map.put('a',"tilea"+"CheckpointError.png");
        map.put('b',"tileb"+"CheckpointError.png");
        map.put('c',"tilec"+"CheckpointError.png");
        map.put('d',"tiled"+"CheckpointError.png");
        map.put('e',"tilee"+"CheckpointError.png");
        ERROR_CHECKPOINT_TILE_MAPPER = Collections.unmodifiableMap(map);
    }


    // Successful tiles sprites
    public static final Map<Character, String> SUCCESS_TILE_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        map.put('.', "tileComplete.png");
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "tile"+c+"Complete.png");
        }
        // letters
        map.put('a',"tilea"+"Complete.png");
        map.put('b',"tileb"+"Complete.png");
        map.put('c',"tilec"+"Complete.png");
        map.put('d',"tiled"+"Complete.png");
        map.put('e',"tilee"+"Complete.png");

        map.put('X', "blocker.png");
        map.put('V', "tileComplete.png");
        map.put('H', "tileComplete.png");
        SUCCESS_TILE_MAPPER = Collections.unmodifiableMap(map);
    }

    // Starting / Finishing blocks.
    public static final Map<Character, String> START_TILE_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "start"+c+".png");
        }
        // Letters
        map.put('a',"starta.png");
        map.put('b',"startb.png");
        map.put('c',"startc.png");
        map.put('d',"startd.png");
        map.put('e',"starte.png");
        map.put('X', "blocker.png");
        map.put('V', "tileVertical.png");
        map.put('H', "tileHorizontal.png");
        START_TILE_MAPPER = Collections.unmodifiableMap(map);
    }

    // Connectors - Horizontal.
    public static final Map<Character, String> HORIZONTAL_CONNECTOR_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "connect_horizontal"+c+".png");
        }
        // Letters
        map.put('a',"connect_horizontala.png");
        map.put('b',"connect_horizontalb.png");
        map.put('c',"connect_horizontalc.png");
        map.put('d',"connect_horizontald.png");
        map.put('e',"connect_horizontale.png");
        HORIZONTAL_CONNECTOR_MAPPER = Collections.unmodifiableMap(map);
    }

    // Connectors - Vertical.
    public static final Map<Character, String> VERTICAL_CONNECTOR_MAPPER;
    static {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            char c = String.valueOf(i).charAt(0);
            map.put(c, "connect_vertical"+c+".png");
        }
        // Letters
        map.put('a',"connect_verticala.png");
        map.put('b',"connect_verticalb.png");
        map.put('c',"connect_verticalc.png");
        map.put('d',"connect_verticald.png");
        map.put('e',"connect_verticale.png");

        VERTICAL_CONNECTOR_MAPPER = Collections.unmodifiableMap(map);
    }
}
