package de.superioz.library.bukkit.logging;

import de.superioz.library.java.util.time.TimeUtils;
import org.bukkit.plugin.Plugin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class created on April in 2015
 */
public class LogCache {

    protected List<String> lines;
    protected long startTimestamp;
    protected long endTimestamp;
    protected Plugin plugin;
    protected String folder;

    public LogCache(Plugin plugin, String folder){
        this.lines = new ArrayList<>();
        this.plugin = plugin;
        this.folder = folder;

        if(!folder.isEmpty()){
            this.folder = "/" + folder;
        }

        startTimestamp = TimeUtils.timestamp();
        lines.add("# Start logfile @" + startTimestamp);
    }

    /**
     * Only important for me tho
     */
    public LogCache log(String msg){
        lines.add("[" + TimeUtils.getCurrentTime() + "]: " + msg);
        return this;
    }

    /**
     * Only important for me tho
     */
    public void build(){
        endTimestamp = TimeUtils.timestamp();

        String fileName = TimeUtils.getCurrentTime("dd-MM-YYYY_HH-mm-ss");
        File f = new File(plugin.getDataFolder() + folder, fileName + ".log");

        if(!f.exists()){
            f.getParentFile().mkdirs();
            try{
                f.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        // Set text of file
        try{
            final PrintWriter writer = new PrintWriter(f, "UTF-8");

            for(String l : lines){
                writer.println(l);
            }

            writer.println("# End logfile @" + endTimestamp);
            writer.close();
        }catch(FileNotFoundException
                | UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

    /**
     * Only important for me tho
     */
    public long end(){
        return endTimestamp;
    }

    /**
     * Only important for me tho
     */
    public long start(){
        return startTimestamp;
    }
}
