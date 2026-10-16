# playground

Pages to show, one at a time. The site opens on the first page; the menu button at the top left opens the page
index on the left side.

## Pages

| Page | Folder |
|---|---|
| Gun Digitizer Workflow: from a 1940 field manual to a rigged, animated M1911A1 | `public/pages/gun-digitizer/` |

## Add a page

1. Put the page in its own folder: `public/pages/<id>/index.html`, with its pictures beside it.
2. Add it to `public/pages.json`: `{"id", "title", "about", "path": "pages/<id>/"}`.

The index lists the pages in the order of `pages.json`. A page opens at `/#<id>`.

## Cloudflare Pages

Connect this repo in Cloudflare Pages with:

- Build command: none
- Build output directory: `public`

`wrangler.jsonc` says the same, so `npx wrangler pages deploy` also works from this folder.
