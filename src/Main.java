import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        krypton("zorxv dzh yvtrmmrmt gl tvg evib grivw lu hrggrmt yb svi hrhgvi lm gsv yzmp, zmw lu szermt mlgsrmt gl wl: lmxv li gdrxv hsv szw kvvkvw rmgl gsv yllp svi hrhgvi dzh ivzwrmt, yfg rg szw ml krxgfivh li xlmevihzgrlmh rm rg, 'zmw dszg rh gsv fhv lu z yllp,' gslftsg zorxv 'drgslfg krxgfivh li xlmevihzgrlmh?'" +
                "hl hsv dzh xlmhrwvirmt rm svi ldm nrmw (zh dvoo zh hsv xlfow, uli gsv slg wzb nzwv svi uvvo evib hovvkb zmw hgfkrw), dsvgsvi gsv kovzhfiv lu nzprmt z wzrhb-xszrm dlfow yv dligs gsv gilfyov lu tvggrmt fk zmw krxprmt gsv wzrhrvh, dsvm hfwwvmob z dsrgv izyyrg drgs krmp vbvh izm xolhv yb svi." +
                "gsviv dzh mlgsrmt hl evib ivnzipzyov rm gszg; mli wrw zorxv gsrmp rg hl evib nfxs lfg lu gsv dzb gl svzi gsv dzyyrg hzb gl rghvou, 'ls wvzi! ls wvzi! I hszoo yv ozgv!' (dsvm hsv gslftsg rg levi zugvidziwh, rg lxxfiivw gl svi gszg hsv lftsg gl szev dlmwvivw zg gsrh, yfg zg gsv grnv rg zoo hvvnvw jfrgv mzgfizo); yfg dsvm gsv izyyrg zxgfzoob gllp z dzgxs lfg lu rgh dzrhgxlzg-klxpvg, zmw ollpvw zg rg, zmw gsvm sfiirvw lm, zorxv hgzigvw gl svi uvvg, uli rg uozhsvw zxilhh svi nrmw gszg hsv szw mvevi yvuliv hvvm z izyyrg drgs vrgsvi z dzrhgxlzg-klxpvg, li z dzgxs gl gzpv lfg lu rg, zmw yfimrmt drgs xfirlhrgb, hsv izm zxilhh gsv urvow zugvi rg, zmw uligfmzgvob dzh qfhg rm grnv gl hvv rg klk wldm z ozitv izyyrg-slov fmwvi gsv svwtv.");
    }

    public static void krypton(String s) {
        Map<Character, Integer> ergebniss = new HashMap<>();
        String formated = s.replaceAll(" ", "");
        String toActual = formated.toLowerCase();
        char[] arr = toActual.toCharArray();
        for (char h : arr) {
            if(ergebniss.containsKey(h)){
                int value = ergebniss.get(h);
                value +=1;
                ergebniss.put(h, value);
            }else{
                ergebniss.put(h,1);
            }

        }
        System.out.println(ergebniss);
    }

}
