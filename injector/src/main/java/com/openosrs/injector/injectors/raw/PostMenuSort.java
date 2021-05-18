package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.GetStatic;

import java.util.Iterator;

public class PostMenuSort extends AbstractInjector {
	public PostMenuSort(InjectData inject) {
		super(inject);
	}

	@Override
	public void inject() {
		log.info("YOLO!!");
		final Method menu = InjectUtil.findMethod(inject, "menu", "Client", null, true, false);

		int injectIdx = 0;
		Instruction labelIns = null;
		Label label = null;

		Instructions ins = menu.getCode().getInstructions();
		Iterator<Instruction> iterator = ins.getInstructions().iterator();
		while (iterator.hasNext()) {
			injectIdx++;
			Instruction ic = iterator.next();
			if (!(ic instanceof GetStatic)) {
				continue;
			}

			log.info("static" + ((GetStatic) ic).getField().getName());
		}
		log.info("count " + injectIdx);
	}
}
