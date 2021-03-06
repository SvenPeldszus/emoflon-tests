package org.moflon.processdef;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;

import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.SystemModule;

public class TestCycleMain {
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		
		SystemModule system = (SystemModule) eMoflonEMFUtil.loadAndInitModel(ProcessDefinitionPackage.eINSTANCE, "instances/processDefModuleWithCycle.xmi");
		
		system.forbidCycles();
		
		
	}
}
