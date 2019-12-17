package transform;

import commands.*;

import java.util.ArrayList;
import java.util.List;

public class CommandsTransform {

    public List<MainCommand> createFor(String programCode) {
        List<MainCommand> list = new ArrayList<MainCommand>();
        int level = 0;
        int startLoopIndex = 0;
        char[] input = programCode.toCharArray();

        for (int i = 0; i < programCode.length(); i++) {
            if (input[i] == '[') {
                if (level == 0)
                    startLoopIndex = i;
                level++;
            } else if (input[i] == ']') {
                level--;
                if (level == 0) {
                    String loopInput = programCode.substring(startLoopIndex + 1, i);
                    list.add(new Cycle(createFor(loopInput)));
                }
            } else if (level == 0) {
                list.add(getSimpleCommand(input[i]));
            }

        }
        return list;
    }

    private MainCommand getSimpleCommand(Character character) {
        if (character == '+') {
            return new Increment();
        } else if (character == '>') {
            return new NextCell();
        } else if (character == '<') {
            return new PreviousCell();
        } else if (character == '-') {
            return new Decrement();
        } else if (character == '.') {
            return new Print();
        }
       return new Print();
    }
}
