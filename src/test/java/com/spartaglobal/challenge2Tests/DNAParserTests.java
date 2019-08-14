package com.spartaglobal.challenge2Tests;

import com.spartaglobal.challenge2.DNAParser;
import org.junit.Assert;
import org.junit.Test;

public class DNAParserTests {

    DNAParser dnaParser = new DNAParser();
    String dnaString = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";

    @Test
    public void dnaParserTest(){
        Assert.assertEquals("20 12 17 21", dnaParser.sequenceCount(dnaString));
    }

}
