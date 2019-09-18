package it.beije.malang;


import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.*;

public final class StringBodyBuilder {

    private StringBuilder sb;

    /** use serialVersionUID for interoperability */
    static final long serialVersionUID = 4383685877147921100L;

    /**
     * Constructs a string builder with no characters in it and an
     * initial capacity of 16 characters.
     */
    public StringBodyBuilder() {
        sb = new StringBuilder(16);
    }

    /**
     * Constructs a string builder with no characters in it and an
     * initial capacity specified by the {@code capacity} argument.
     *
     * @param      capacity  the initial capacity.
     * @throws     NegativeArraySizeException  if the {@code capacity}
     *               argument is less than {@code 0}.
     */
    public StringBodyBuilder(int capacity) {
        sb = new StringBuilder(capacity);
    }

    /**
     * Constructs a string builder initialized to the contents of the
     * specified string. The initial capacity of the string builder is
     * {@code 16} plus the length of the string argument.
     *
     * @param   str   the initial contents of the buffer.
     */
    public StringBodyBuilder(String str) {
        sb = new StringBuilder(str.length() + 16);
        append(str);
    }

    /**
     * Constructs a string builder that contains the same characters
     * as the specified {@code CharSequence}. The initial capacity of
     * the string builder is {@code 16} plus the length of the
     * {@code CharSequence} argument.
     *
     * @param      seq   the sequence to copy.
     */
    public StringBodyBuilder(CharSequence seq) {
        this(seq.length() + 16);
        append(seq);
    }
    
    public StringBodyBuilder append(Object obj) {
        return append(String.valueOf(obj));
    }
    
    public StringBodyBuilder append(String str) {
        sb.append(str);
        return this;
    }

    /**
     * Appends the specified {@code StringBuffer} to this sequence.
     * <p>
     * The characters of the {@code StringBuffer} argument are appended,
     * in order, to this sequence, increasing the
     * length of this sequence by the length of the argument.
     * If {@code sb} is {@code null}, then the four characters
     * {@code "null"} are appended to this sequence.
     * <p>
     * Let <i>n</i> be the length of this character sequence just prior to
     * execution of the {@code append} method. Then the character at index
     * <i>k</i> in the new character sequence is equal to the character at
     * index <i>k</i> in the old character sequence, if <i>k</i> is less than
     * <i>n</i>; otherwise, it is equal to the character at index <i>k-n</i>
     * in the argument {@code sb}.
     *
     * @param   sb   the {@code StringBuffer} to append.
     * @return  a reference to this object.
     */
    public StringBodyBuilder append(StringBuffer sb) {
        sb.append(sb);
        return this;
    }

    public StringBodyBuilder append(CharSequence s) {
        sb.append(s);
        return this;
    }

    /**
     * @throws     IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder append(CharSequence s, int start, int end) {
        sb.append(s, start, end);
        return this;
    }

    public StringBodyBuilder append(char[] str) {
        sb.append(str);
        return this;
    }

    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder append(char[] str, int offset, int len) {
        sb.append(str, offset, len);
        return this;
    }

    public StringBodyBuilder append(boolean b) {
        sb.append(b);
        return this;
    }

    public StringBodyBuilder append(char c) {
        sb.append(c);
        return this;
    }

    public StringBodyBuilder append(int i) {
        sb.append(i);
        return this;
    }

    public StringBodyBuilder append(long lng) {
        sb.append(lng);
        return this;
    }

    public StringBodyBuilder append(float f) {
        sb.append(f);
        return this;
    }

    public StringBodyBuilder append(double d) {
        sb.append(d);
        return this;
    }

    /**
     * @since 1.5
     */
    public StringBodyBuilder appendCodePoint(int codePoint) {
        sb.appendCodePoint(codePoint);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder delete(int start, int end) {
        sb.delete(start, end);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder deleteCharAt(int index) {
        sb.deleteCharAt(index);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder replace(int start, int end, String str) {
        sb.replace(start, end, str);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int index, char[] str, int offset,
                                    int len)
    {
        sb.insert(index, str, offset, len);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, Object obj) {
        sb.insert(offset, obj);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, String str) {
        sb.insert(offset, str);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, char[] str) {
        sb.insert(offset, str);
        return this;
    }

    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        return this;
    }

    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int dstOffset, CharSequence s,
                                    int start, int end)
    {
        sb.insert(dstOffset, s, start, end);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, boolean b) {
        sb.insert(offset, b);
        return this;
    }

    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, char c) {
        sb.insert(offset, c);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, int i) {
        sb.insert(offset, i);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, long l) {
        sb.insert(offset, l);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, float f) {
        sb.insert(offset, f);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBodyBuilder insert(int offset, double d) {
        sb.insert(offset, d);
        return this;
    }

    public int indexOf(String str) {
        return sb.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return sb.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }

    public StringBodyBuilder reverse() {
        sb.reverse();
        return this;
    }

    public String toString() {
        // Create a copy, don't share the array
        return sb.toString();
    }

    /**
     * simple HTTP request to retrieve information about BodyBuilding world
     */
    private static String HTMLPageFetch(String url){
        String content = null;
        URLConnection connection = null;
        try {
            connection =  new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }

        return content;
    }

    /**
     * returns the complete and updated map (based on Wikipedia) of the Mr. Olympia Champions since 1965
     */
    public static Map<Integer, String> getMrOlympiaChampions(){
        final String htmlPage = HTMLPageFetch("https://it.wikipedia.org/w/api.php?action=parse&page=Mister_Olympia&section=5&prop=wikitext&format=phpfm");
        final int PRE_OFFSET = 31;
        final int PRE_LAST_OFFSET = 1;
        final int FLAG_OFFSET = 11;
        String bb = "";
        String year  = "1965";
        String nation = "";
        Map<Integer,String> map = new HashMap<>();

        int index = htmlPage.indexOf("{|");
        int lastIndex = htmlPage.indexOf("|}");

        String table = htmlPage.substring(index, lastIndex);

        while(Integer.parseInt(year) < LocalDate.now().getYear()) {

            if(Integer.parseInt(year) > 2017){
                index = table.indexOf("2");
                lastIndex = index + 4;
                year = table.substring(index, lastIndex);

                table = table.substring(lastIndex + 2);

                index = table.indexOf("{{");
                lastIndex = table.indexOf("}}");
                nation = table.substring(index + FLAG_OFFSET, lastIndex);

                table = table.substring(lastIndex + 2);

                index = table.indexOf(" ");
                lastIndex = table.indexOf("|");
                bb = table.substring(index + 1, lastIndex);

                try {
                    table = table.substring(table.indexOf("|-"));
                }
                catch (StringIndexOutOfBoundsException ex){
                    table = "";
                }

                map.put(Integer.valueOf(year), nation.trim() + "\t" + bb.trim());
            }
            else {
                index = table.indexOf("[[");
                lastIndex = table.indexOf("]]");
                year = table.substring(index + 2, lastIndex);


                if (year.equals("1987")) {
                    nation = "SWE";

                    table = table.substring(lastIndex + 2);

                    index = table.indexOf("{{");
                    lastIndex = table.indexOf("}}");
                    table = table.substring(lastIndex + 2);

                    index = table.indexOf("[[");
                    lastIndex = table.indexOf("]]");
                    bb = table.substring(index + 2, lastIndex);

                    table = table.substring(table.indexOf("|-"));

                    map.put(Integer.valueOf(year), nation + "\t" + bb);
                    continue;
                }

                table = table.substring(lastIndex + 2);

                index = table.indexOf("{{");
                lastIndex = table.indexOf("}}");
                nation = table.substring(index + FLAG_OFFSET, lastIndex);

                table = table.substring(lastIndex + 2);

                index = table.indexOf("[[");
                lastIndex = table.indexOf("]]");
                bb = table.substring(index + 2, lastIndex);

                table = table.substring(table.indexOf("|-"));

                map.put(Integer.valueOf(year), nation.trim() + "\t" + bb.trim());
            }
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().contains("(culturista)|")){
                String str = entry.getValue().replace("(culturista)", "");
                entry.setValue(str);
                map.replace(entry.getKey(), entry.getValue());
            }
        }

        return map;
    }

    /**
     * returns the string version of the mrOlympiaChampions map
     */
    public static String mrOmlympiaChampionsToString(){
        Map<Integer, String> map = getMrOlympiaChampions();
        StringBuilder res = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            String year = String.valueOf(entry.getKey());
            String other = entry.getValue();
            res.append("" + year + "\t" + other + "\n");
        }

        return res.toString();
    }

    /**
     * returns the BodyBuilt version of the specified string
     */
    public String toBBString(){
        char first = Character.toUpperCase(sb.toString().charAt(0));
        char last = Character.toUpperCase(sb.toString().charAt(sb.toString().length() - 1));

        return "" + first + first + first + String.valueOf(sb.toString()) + last + last + last;
    }

    /**
     * simple credit method
     */
    public static String credits(){
        return "Designed by Vittorio Luoni\nDeveloped by Franceso Corbosiero\nVittorio Luoni Consulting (c)";
    }

}
