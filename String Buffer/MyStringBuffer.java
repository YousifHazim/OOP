public class MyStringBuffer {

    private char[] characters;

    public MyStringBuffer(String string)
    {
        this.characters = new char[string.length()];

        for(int i=0;i<string.length();i++)
        {
            characters[i] = string.charAt(i);
        }
    }

    public void print()
    {
        for (int i=0;i<this.characters.length;i++)
        {
            System.out.print(this.characters[i]);
        }
        System.out.println();
    }

    public int indexOf(char c)
    {
        int flag=0;
        for (int i=0;i<this.characters.length;i++)
        {
            if (c == this.characters[i])
                return i;
        }
        return -1;
    }

    public int length()
    {
        return characters.length;
    }

    public void erase(int index, int length)
    {

        char[] charactersErase;

        if( index<0 || index>characters.length ) { // Check the index if is incorrect
            System.out.printf("index is incorrect");
            return;
        }

        if (index + length >= characters.length) // if the erase in the end of the string
        {
            charactersErase = new char[index];

            for (int i=0;i<index;i++)
            {
                charactersErase[i] = characters[i];
            }
        }
        else // if the erase in the first or in the middle of the string
        {
            charactersErase = new char[characters.length - length];
            int j=0;

            for (int i=0;i<index;i++)
            {
                charactersErase[j] = characters[i];
                j++;
            }

            for (int i=index+length;i<characters.length;i++)
            {
                charactersErase[j] = characters[i];
                j++;
            }
            characters = charactersErase;
        }
    }

    public void insert(int index, String str)
    {
        char[] charactersInsert;
        int j=0;

        if( index<0 || index>characters.length ) { // Check the index if is incorrect
            System.out.printf("index is incorrect");
            return;
        }

        charactersInsert = new char[str.length()+characters.length];

        for (int i=0;i<index;i++) // Put the first char in the array
        {
            charactersInsert[j] = characters[i];
            j++;
        }

        for (int i=0;i<str.length();i++) // Add the insert string to the array
        {
            charactersInsert[j] = str.charAt(i);
            j++;
        }

        for (int i=index;i<this.characters.length;i++) // Put the last char in the array
        {
            charactersInsert[j] = characters[i];
            j++;
        }
        this.characters = charactersInsert;
    }
}
