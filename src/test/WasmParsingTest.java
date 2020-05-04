package test;

import com.intellij.testFramework.ParsingTestCase;
import com.wasmplugin.WasmParserDefinition;

public class WasmParsingTest extends ParsingTestCase {
    public WasmParsingTest() {
        super("programs", "wat", new WasmParserDefinition());
    }

    public void testTableDefinition() {
        doTest(true);
    }
    public void testMemoryDefinition() {
        doTest(true);
    }
    public void testFunctionDefinition() {
        doTest(true);
    }
    public void testImportsDefinition() {
        doTest(true);
    }

    public void testCommentsDefinition() {
        doTest(true);
    }
    public void testOpsDefinition() {
        doTest(true);
    }

    /**
     *
     * @return path to test data file directory relative to root of this module.
     */
    @Override
    protected String getTestDataPath() {
        return "src/test";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}