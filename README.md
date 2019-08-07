# ToastMessage, CustomToast & Snackbar.

![](ToastMessage_CustomToast_Snackbar_Android_Github_gif.gif)

## Introduction

To show the working and to demonstrate how toast and snackbar pop ups to user screen.

## Toast Message

The Toast Message is a simple pop-up message that displays a short string of texts to the user.

#### Code to show Toast : 

```
        Toast toast = Toast.makeText(getApplicationContext(),"Hello, This is a Toast.",toastDuration);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
```

#### Code to show  Custom Toast :

```
LayoutInflater layoutInflater = getLayoutInflater();
        View viewLayout = layoutInflater.inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.custom_toast_layout));

        TextView textView = viewLayout.findViewById(R.id.customToast_text);
        textView.setText(R.string.text_show_custom_toast_text);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(toastDuration);
        toast.setGravity(Gravity.BOTTOM,0,50);
        toast.setView(viewLayout);
        toast.show();
```

#### Note : 

To show custom toast remember to make a xml layout and inflate using this piece of code
```
LayoutInflater layoutInflater = getLayoutInflater();
        View viewLayout = layoutInflater.inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.custom_toast_layout));
```


## Snackbar Messages

Google recommends that developers use the snackbar.

#### Code to show Snackbar

```
        Snackbar snackbar = Snackbar.make(view,"Follow Me On Github,Thank You.",Snackbar.LENGTH_LONG);
        snackbar.show();
```

#### Code to show Snackbar with Action

```
 Snackbar.make(view,"Follow me On Github, Thanks!!",Snackbar.LENGTH_LONG)
                .setAction("Ok !", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you, Stay Connected.", Toast.LENGTH_SHORT).show();
            }
        })
                .setActionTextColor(Color.BLUE)
                .show();
```

# Social Links. 

[Twitter](https://twitter.com/amansharma_dev/ "Twitter") :bird:

# Thank you.
