package tinker.toolconstruct.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class FrypanContainer extends Container
{
    public FrypanLogic logic;
    public int progress = 0;
    public int fuel = 0;
    public int fuelGague = 0;

    public FrypanContainer(InventoryPlayer inventoryplayer, FrypanLogic frypan)
    {
        logic = frypan;
        //this.addSlotToContainer(new Slot(frypan, 0, 56, 17));
        //this.addSlotToContainer(new Slot(frypan, 0, 44, 45));
        this.addSlotToContainer(new Slot(frypan, 1, 26, 45));
    	for (int y = 0; y < 2; y++)
    		for (int x = 0; x < 4; x++)
        		this.addSlotToContainer(new Slot(frypan, 2 + x + y*4, 70 + x*18, 27 + y*18));
        
        /* Player inventory */
		for (int column = 0; column < 3; column++)
        {
            for (int row = 0; row < 9; row++)
            {
            	this.addSlotToContainer(new Slot(inventoryplayer, row + column * 9 + 9, 8 + row * 18, 84 + column * 18));
            }
        }

        for (int column = 0; column < 9; column++)
        {
        	this.addSlotToContainer(new Slot(inventoryplayer, column, 8 + column * 18, 142));
        }
    }

    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        for (int i = 0; i < crafters.size(); i++)
        {
            ICrafting icrafting = (ICrafting)crafters.get(i);
            if (progress != logic.progress)
            {
                icrafting.sendProgressBarUpdate(this, 0, logic.progress);
            }
            if (fuel != logic.fuel)
            {
                icrafting.sendProgressBarUpdate(this, 1, logic.fuel);
            }
            if (fuelGague != logic.fuelGague)
            {
                icrafting.sendProgressBarUpdate(this, 2, logic.fuelGague);
            }
        }

        progress = logic.progress;
        fuel = logic.fuel;
        fuelGague = logic.fuelGague;
    }

    public void updateProgressBar(int i, int j)
    {
        if (i == 0)
        {
            logic.progress = j;
        }
        if (i == 1)
        {
            logic.fuel = j;
        }
        if (i == 2)
        {
            logic.fuelGague = j;
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return logic.isUseableByPlayer(entityplayer);
    }
    
    public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
        ItemStack stack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotID);

        if (slot != null && slot.getHasStack())
        {
            ItemStack slotStack = slot.getStack();
            stack = slotStack.copy();

            if (slotID < logic.getSizeInventory())
            {
                if (!this.mergeItemStack(slotStack, logic.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(slotStack, 0, logic.getSizeInventory(), false))
            {
                return null;
            }

            if (slotStack.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return stack;
    }

    /*public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
    	//return null;
        ItemStack stack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotID);

        if (slot != null && slot.getHasStack())
        {
            ItemStack slotStack = slot.getStack();
            stack = slotStack.copy();

            if (slotID == 2)
            {
                if (!this.mergeItemStack(slotStack, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(slotStack, stack);
            }
            else if (slotID != 1 && slotID != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(slotStack) != null)
                {
                    if (!this.mergeItemStack(slotStack, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(slotStack))
                {
                    if (!this.mergeItemStack(slotStack, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (slotID >= 3 && slotID < 30)
                {
                    if (!this.mergeItemStack(slotStack, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (slotID >= 30 && slotID < 39 && !this.mergeItemStack(slotStack, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(slotStack, 3, 39, false))
            {
                return null;
            }

            if (slotStack.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (slotStack.stackSize == stack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, slotStack);
        }

        return stack;
    }*/
}
