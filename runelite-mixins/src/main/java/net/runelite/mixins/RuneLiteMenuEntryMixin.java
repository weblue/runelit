/*
 * Copyright (c) 2018, OpenOSRS
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRuneLiteMenuEntry;

@Mixin(RSRuneLiteMenuEntry.class)
public abstract class RuneLiteMenuEntryMixin implements RSRuneLiteMenuEntry
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public int getItemOp()
	{
		MenuAction var1 = this.getType();
		if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int identifier = this.getIdentifier();
			int param0 = this.getParam0();
			int param1 = this.getParam1();

			if (param1 == 9764864)
			{
				switch (identifier)
				{
					case 1:
						Widget widget = client.getWidget(param1);
						if (widget != null && param0 != -1)
						{
							widget = widget.getChild(param0);
							if (widget != null && widget.getItemId() > -1)
							{
								int shiftClickActionIndex = client.getItemComposition(widget.getItemId()).getShiftClickActionIndex();

								if (shiftClickActionIndex >= 0)
								{
									return shiftClickActionIndex + 1;
								}
							}
						}
						break;
					case 2:
						return 1;
					case 3:
						return 2;
					case 4:
						return 3;
					case 5:
					default:
						break;
					case 6:
						return 4;
					case 7:
						return 5;
				}
			}
		}

		return -1;
	}

	@Inject
	@Override
	public int getItemId()
	{
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int param1 = this.getParam1();
			int param0 = this.getParam0();

			if (param1 == 9764864)
			{
				Widget widget = client.getWidget(param1);
				if (param0 != -1)
				{
					widget = widget.getChild(param0);
					return widget.getItemId();
				}
			}
		}

		return -1;
	}

	@Inject
	@Override
	public Widget getWidget()
	{
		int param1 = this.getParam1();
		int param0 = this.getParam0();

		Widget widget = client.getWidget(param1);

		if (widget == null)
		{
			return null;
		}

		if (param0 != -1)
		{
			Widget child = widget.getChild(param0);

			if (child != null)
			{
				return child;
			}
		}

		return widget;
	}
}
