package com.exlibris.rosetta.repository.plugin.mdExtractor.pdf;

import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractNLNZMDExtractorPluginTest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PDFHULMDExtractorPluginTest extends AbstractNLNZMDExtractorPluginTest {
    private static PDFHULMDExtractorPlugin testInstance = new PDFHULMDExtractorPlugin();

    @BeforeClass
    public static void init() {
        testInstance.initParams(initParams);
    }

    @Test
    public void testGetAgent() {
        String agent = testInstance.getAgent();
        assert agent != null;
    }

    @Override
    public void testGetSupportedAttributeNames() throws Exception {

    }

    @Override
    public void testExtract() throws Exception {

    }

    @Override
    protected String getExpectedFileFormatName() {
        return null;
    }

    @Override
    protected void prepareExpectedValues() {

    }
}
