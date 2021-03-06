package com.example.matt.myapplication;

import android.net.Uri;

import com.example.matt.myapplication.fragments.HoursListFragment;
import com.example.matt.myapplication.models.HoursModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 12/16/2017.
 */

public class HoursCollection
{
    private static HoursCollection collection;

    public static HoursCollection GetInstance()
    {
        if (collection == null)
        {
            collection = new HoursCollection();
        }

        return collection;
    }

    private List<HoursModel> hours;

    private HoursCollection()
    {
        this.hours = new ArrayList<>();

        HoursModel hours1 = new HoursModel();
        hours1.setHours("1pm - 2pm");
        hours1.setEmployee("Brett");
        hours1.setDate("9");
        hours1.setNumber("714-777-7777");
        hours1.setPassword("714-777-7777");
        hours1.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours1);

        HoursModel hours2 = new HoursModel();
        hours2.setHours("3pm - 4pm");
        hours2.setEmployee("Joe");
        hours2.setDate("9");
        hours2.setNumber("714-777-7777");
        hours2.setPassword("714-777-7777");
        hours2.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours2);

        HoursModel hours3 = new HoursModel();
        hours3.setHours("5pm - 11pm");
        hours3.setEmployee("Bob");
        hours3.setDate("10");
        hours3.setNumber("714-777-7777");
        hours3.setPassword("714-777-7777");
        hours3.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours3);

        HoursModel hours4 = new HoursModel();
        hours4.setHours("All day every day");
        hours4.setEmployee("Ryan");
        hours4.setDate("11");
        hours4.setNumber("714-777-7777");
        hours4.setPassword("714-777-7777");
        hours4.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours4);

        HoursModel hours5 = new HoursModel();
        hours5.setHours("6pm - 11pm");
        hours5.setEmployee("Matt");
        hours5.setDate("12");
        hours5.setNumber("714-777-7777");
        hours5.setPassword("714-777-7777");
        hours5.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours5);

        HoursModel hours6 = new HoursModel();
        hours6.setHours("1am - 4am");
        hours6.setEmployee("Zach");
        hours6.setDate("13");
        hours6.setNumber("714-777-7777");
        hours6.setPassword("714-777-7777");
        hours6.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours6);

        HoursModel hours7 = new HoursModel();
        hours7.setHours("5pm - 5am");
        hours7.setEmployee("Tyler");
        hours7.setDate("14");
        hours7.setNumber("714-777-7777");
        hours7.setPassword("714-777-7777");
        hours7.setProfile(Uri.parse("android.resource://com.example.matt.myapplication/mipmap/profileimage"));
        this.hours.add(hours7);
    }

    //returns list to be accessed by other methods
    public List<HoursModel> getHours()
    {
        return this.hours;
    }

    public HoursModel getHours(String id)
    {
        for(HoursModel hours : this.hours)
        {
            if (hours.getID().equals(id))
            {
                return hours;
            }
        }

        return null;
    }

    public int checkDateExist(int d)
    {
        int count = 0;
        for(HoursModel hours : this.hours)
        {
            if (hours.getDateInt() == d)
            {
                count++;
            }
            else {
            }
        }
        return count;
    }

    //returns position information for display changes
    public int indexOf(String id)
    {
        for (int i = 0; i < this.hours.size(); i++) {
            if (this.hours.get(i).getID().equals(id)) {
                return i;
            }
        }
        return 0;
    }
}
